package com.mkbz.phelp.model;

import android.content.ContentValues;
import android.database.Cursor;

import com.mkbz.phelp.database.table.OperatorTable;

public class Operator extends Model {


    public static final String TABLE = "operator" ;

    private int network_code;
    private String name;


    public Operator(){};
    public Operator(Cursor c) {
        this.setId(c.getLong(0));
        this.setNetwork_code(c.getInt(1));
        this.setName(c.getString(2));
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
        return name;
    }

    public int getNetwork_code() {
        return network_code;
    }

    public void setNetwork_code(int network_code) {
        this.network_code = network_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}