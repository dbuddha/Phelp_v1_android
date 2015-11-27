package com.mkbz.phelp.model;

import android.content.ContentValues;
import android.database.Cursor;

import com.mkbz.phelp.database.table.OperatorTable;

public class Operator extends Model {


    public static final String TABLE = "operator" ;

    private String name;
    private String country;


    public Operator(){};
    public Operator(Cursor c) {
        this.setId(c.getLong(0));
        this.setName(c.getString(1));
        this.setCountry(c.getString(2));
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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}