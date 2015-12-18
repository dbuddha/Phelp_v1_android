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
        //TODO: vai faltar executar quando existe numero ou valor no ussd

        Log.i("dialerExecute", "launching dialog for code" + code );
        Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        manager.setCurrentDialer(this);
        manager.startActivityForResult(intent,1);
    }


    public void fixNumber(String cNumber) {
        Log.i("dialerExecute", "fixed with number:" + cNumber );
        code=code.replaceFirst("n",cNumber);
        execute();
    }
}
