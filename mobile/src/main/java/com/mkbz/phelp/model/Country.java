package com.mkbz.phelp.model;

import android.content.ContentValues;
import android.database.Cursor;

public class Country extends Model {

    public Country() {

    }

    public Country(Cursor c) {

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
    public Country createFromCursor(Cursor c) {
        return new Country(c);
    }

    public void setId(long id) {
        this.id = id;
    }


    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return "country";
    }

}