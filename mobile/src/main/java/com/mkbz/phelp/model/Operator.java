package com.mkbz.phelp.model;

import android.content.ContentValues;
import android.database.Cursor;

import com.mkbz.phelp.database.table.OperatorTable;

public class Operator extends Model {


    public static final String TABLE = "operator" ;

    public Operator(){};
    public Operator(Cursor c) {

    }


    @Override
    public String[] getAllColumns() {
        return OperatorTable.COLUMNS;
    }

    @Override
    public ContentValues getContentValues() {
        return null;
    }

    @Override
    public Operator createFromCursor(Cursor c) {
        return new Operator(c);
    }

    public void setId(long id) {
        this.id = id;
    }



    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return TABLE;
    }
}