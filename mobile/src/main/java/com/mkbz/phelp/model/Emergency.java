package com.mkbz.phelp.model;

import android.content.ContentValues;
import android.database.Cursor;

public class Emergency extends Model {

    public Emergency() {

    }

    public Emergency(Cursor c) {

    }


    @Override
    public ContentValues getContentValues() {
        return null;
    }

    @Override
    public String[] getAllColumns() {
        return new String[0];
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
        return "emergency";
    }

}