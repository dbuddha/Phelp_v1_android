package com.mkbz.phelp.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.mkbz.phelp.database.table.TableList;

/**
 * Created by MARCELO on 14-11-2015.
 */
public class PhelpDbHelper extends SQLiteOpenHelper {

    private final static String DATABASE_NAME="phelp_mkbz.db";
    private final static int DATABASE_VERSION=1;
    private final TableList tables;

    public PhelpDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.tables=new TableList();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        tables.onCreate(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        tables.onUpgrade(db,oldVersion,newVersion);
    }
}
