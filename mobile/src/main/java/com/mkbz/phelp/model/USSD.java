package com.mkbz.phelp.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.mkbz.phelp.database.table.USSDTable;

public class USSD extends Model {

    public static final String TABLE = "ussd" ;

    private String title;
    private String description;
    private String code;

    public USSD(){};

    public USSD(Cursor c) {
        //TODO: falta fazer load apartir de cursor
    }

    @Override
    public ContentValues getContentValues() {
        ContentValues cv = new ContentValues();

        cv.put("title",title);
        cv.put("description",description);
        cv.put("code",code);

        return cv;
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
}