package com.mkbz.phelp.database.table;

import android.database.sqlite.SQLiteDatabase;

import com.mkbz.phelp.database.Table;

/**
 * Created by MARCELO on 15-11-2015.
 */
public class TableList {

    private static final Table[] tables = {new CountryTable(), new OperatorTable(), new USSDTable(), new EmergencyTable()};


    public void onCreate(SQLiteDatabase db) {
        for (int i = 0; i < tables.length; ++i) {
            db.execSQL(tables[i].getCreate());
            db.execSQL(tables[i].getPersistentData());
        }
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        for (int i = 0; i < tables.length; ++i) {
            db.execSQL(tables[i].getDelete());
        }

        this.onCreate(db);
    }
}
