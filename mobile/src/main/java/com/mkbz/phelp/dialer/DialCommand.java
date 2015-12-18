package com.mkbz.phelp.dialer;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;

import com.mkbz.phelp.MainActivity;

/**
 * Created by MARCELO on 18-11-2015.
 */
public class DialCommand {

    private String code;
    private Context context;
    private MainActivity manager;

    public DialCommand(String code,Context context,MainActivity fm){
        this.code=code;
        this.context=context;
        this.manager=fm;
    }

    public void execute(){
        if(cleanClode()) context.startActivity(Dialer.getExecutable(this.code));
        else launchDialog();
    }

    private boolean cleanClode(){
        return (this.code.indexOf("n") >=0) || (this.code.indexOf("v")>=0);
    }

    private void launchDialog(){
        //TODO: vai faltar executar quando existe numero ou valor no ussd

        Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);

        manager.setCurrentDialer(this);
        manager.startActivityForResult(intent,1);
    }


    public void fixNumber(String cNumber) {
        code=code.replaceFirst("n",cNumber);
        execute();
    }
}
