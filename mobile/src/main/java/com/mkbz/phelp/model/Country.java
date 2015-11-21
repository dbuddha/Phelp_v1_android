package com.mkbz.phelp.model;

import android.content.ContentValues;
import android.database.Cursor;

import com.mkbz.phelp.database.table.CountryTable;

public class Country extends Model {


    public static final String TABLE = "country" ;

    private String code;
    private String code2;
    private String name;

    public Country() {

    }
    public Country(Cursor c) {
        this.setId(c.getLong(0));
        this.setCode(c.getString(1));
        this.setCode2(c.getString(2));
        this.setName(c.getString(3));
    }


    @Override
    public ContentValues getContentValues() {
        return null;
    }


    @Override
    public String[] getAllColumns() {
        return CountryTable.COLUMNS;
    }
    @Override
    public Country createFromCursor(Cursor c) {
        return new Country(c);
    }

    public void setId(long id) {
        this.id = id;
    }


    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}