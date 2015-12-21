package com.mkbz.phelp.dialer;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.util.Log;

import com.mkbz.phelp.MainActivity;

/**
 * Created by MARCELO on 18-11-2015.
 */
public class DialCommand {

    private String code;
    private Context context;
    private MainActivity manager;

    public DialCommand(String code,MainActivity fm){
        this.code=code;
        this.manager=fm;
    }

    public void execute(){

        Log.i("dialerExecute", "executing with code" + code );

        if(!cleanClode()) manager.executeCommand(Dialer.getExecutable(this.code));
        else launchDialog();
    }

    private boolean cleanClode(){
        boolean aux = (code.indexOf("n") >=0) || (code.indexOf("v")>=0);

        Log.i("dialerExecute","code is clean ? " + code + " -> "+aux);

        return aux;
    }

    private void launchDialog(){

        Intent intent;
        //TODO: vai faltar executar quando existe numero ou valor no ussd
        if(code.indexOf("n") >=0) {
            Log.i("dialerExecute", "launching contact picker for code" + code );
            intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        }else{

            Log.i("dialerExecute", "launching value for code" + code );
            intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        }

        manager.setCurrentDialer(this);
        manager.startActivityForResult(intent, 1);


    }


    public void fixNumber(String cNumber) {
        Log.i("dialerExecute", "fixed with number:" + cNumber );
        cNumber = Utils.fixNumber(cNumber);
        code=code.replaceFirst("n",cNumber);
        execute();
    }
    public void fixValue(String cNumber) {
        Log.i("dialerExecute", "fixed with value:" + cNumber );
        cNumber = Utils.fixNumber(cNumber);
        code=code.replaceFirst("v",cNumber);
        execute();
    }
}
