package com.mkbz.phelp.dialer;

import android.content.Intent;
import android.net.Uri;

/**
 * Created by MARCELO on 18-11-2015.
 */
public abstract class Dialer {

    private static String parseCode(String code){
        return code.replaceAll("#",Uri.encode("#"));
    }

    public static Intent getExecutable(String code){

        String action = Intent.ACTION_DIAL;
        //TODO:change here depending on options to direct call or execute of call/ussd
        //TODO:but permissions to execute call is needed!
        //action = Intent.ACTION_CALL;

        code = parseCode(code);

        Intent executable = new Intent(action,Uri.parse("tel:" + code));

        return executable;
        //startActivity(intent);
    }
}
