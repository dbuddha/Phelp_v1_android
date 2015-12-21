package com.mkbz.phelp.utils;

/**
 * Created by Jos on 21/12/2015.
 */
public class Utils {
    public static String fixNumber(String cNumber) {
        String fixedNumber= parseDoubleZero(cNumber);
        fixedNumber = fixedNumber.replace(/\+(9[976]\d|8[987530]\d|6[987]\d|5[90]\d|42\d|3[875]\d|2[98654321]\d|9[8543210]|8[6421]|6[6543210]|5[87654321]|4[987654310]|3[9643210]|2[70]|7|1)/,"");
        return fixedNumber;
    }

    public static String parseDoubleZero(String str){
        String noDooubleZero = str.replace(/\b00/, "+");
        return noDooubleZero;
    }


    }
}
