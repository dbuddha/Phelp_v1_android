package com.mkbz.phelp.dialer;

import android.app.FragmentManager;
import android.content.Context;

/**
 * Created by MARCELO on 18-11-2015.
 */
public class DialCommand {

    private String code;
    private Context context;
    private FragmentManager manager;

    public DialCommand(String code,Context context,FragmentManager fm){
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
    }

}
