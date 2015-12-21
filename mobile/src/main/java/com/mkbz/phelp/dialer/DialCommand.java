package com.mkbz.phelp.dialer;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.util.Log;

import com.mkbz.phelp.MainActivity;
import com.mkbz.phelp.utils.DialogNumber;
import com.mkbz.phelp.utils.Inputs;
import com.mkbz.phelp.utils.Utils;

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
        this.context = manager.getApplicationContext();
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
        int reqCode;

        if(code.indexOf("n") >=0) {
            reqCode = MainActivity.PICK_CONTACT;
            Log.i("dialerExecute", "launching contact picker for code" + code);
            intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        }else{
            reqCode = MainActivity.PICK_VALUE;
            intent = new Intent(context, DialogNumber.class);
        }
        manager.setCurrentDialer(this);
        manager.startActivityForResult(intent, reqCode);
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
