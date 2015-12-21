package com.mkbz.phelp.database;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by MARCELO on 14-11-2015.
 */
public class PhelpDbHelper extends SQLiteAssetHelper {

    private final static String DATABASE_NAME = "phelp_mkbz.db";
    private final static int DATABASE_VERSION = 3;

    public PhelpDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        setForcedUpgrade();
    }
}
