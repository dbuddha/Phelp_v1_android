package com.mkbz.phelp.model;

import android.content.ContentValues;
import android.database.Cursor;

import com.mkbz.phelp.database.table.USSDTable;

public class USSD extends Model {

    public static final String TABLE = "ussd" ;

    public USSD() {

    }

    public USSD(Cursor c) {

    }


    @Override
    public ContentValues getContentValues() {
        return null;
    }

    @Override
    public String[] getAllColumns() {
        return USSDTable.COLUMNS;
    }

    @Override
    public USSD createFromCursor(Cursor c) {
        return new USSD(c);
    }

    public void setId(long id) {
        this.id = id;
    }


    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return "ussd";
    }

}