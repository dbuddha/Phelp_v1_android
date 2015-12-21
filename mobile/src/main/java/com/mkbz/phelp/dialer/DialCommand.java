package com.mkbz.phelp.dialer;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.util.Log;

import com.mkbz.phelp.MainActivity;
import com.mkbz.phelp.utils.DialogNumber;
import com.mkbz.phelp.utils.PromptRunnable;
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

    private void getFromContact(){
        Intent intent;
        int reqCode;
        reqCode = MainActivity.PICK_CONTACT;
        Log.i("dialerExecute", "launching contact picker for code" + code);
        intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        manager.setCurrentDialer(this);
        manager.startActivityForResult(intent, reqCode);
    }

    private void launchDialog(){


        if(code.indexOf("n") >=0) {
            manager.promptContactForResult(new PromptRunnable(){
                public void run() {
                    String value=this.getValue();
                    fixNumber(value);
                }
            }, new PromptRunnable(){
                @Override
                public void run() {
                    getFromContact();
                }
            });
        }else{
            manager.promptForResult(new PromptRunnable() {
                // put whatever code you want to run after user enters a result
                public void run() {
                    // get the value we stored from the dialog
                    String value = this.getValue();
                    fixValue(value);
                }
            });

        }
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
