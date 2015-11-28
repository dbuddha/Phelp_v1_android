package com.mkbz.phelp.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.mkbz.phelp.database.table.USSDTable;

public class USSD extends Model {

    public static final String TABLE = "ussd" ;

    private String code;
    private String title;
    private String description;
    private String country;
    private int operator;

    public USSD(){};

    public USSD(Cursor c) {

        id=c.getLong(0);
        code=c.getString(1);
        title=c.getString(2);
        description=c.getString(3);
        country=c.getString(4);
        operator=c.getInt(5);
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
        return TABLE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }
}