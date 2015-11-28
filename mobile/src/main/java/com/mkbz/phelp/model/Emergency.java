package com.mkbz.phelp.model;

import android.content.ContentValues;
import android.database.Cursor;

import com.mkbz.phelp.database.table.EmergencyTable;

public class Emergency extends Model {


    public static final String TABLE = "emergency" ;
    private String code = "code";
    private String title = "title";
    private String description = "description";
    private String country = "country_id";

    public Emergency() {

    }
    public Emergency(Cursor c) {
        id=c.getLong(0);
        code=c.getString(1);
        title=c.getString(2);
        description=c.getString(3);
        country=c.getString(4);
    }


    @Override
    public ContentValues getContentValues() {
        return null;
    }


    @Override
    public String[] getAllColumns() {
        return EmergencyTable.COLUMNS;
    }

    @Override
    public Emergency createFromCursor(Cursor c) {
        return new Emergency(c);
    }

    public void setId(long id) {
        this.id = id;
    }


    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return TABLE;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}