package com.mkbz.phelp.model;

import android.content.ContentValues;
import android.database.Cursor;

public class Operator extends Model {

    public Operator() {

    }

    public Operator(Cursor c) {

    }

    @Override
    public String[] getAllColumns() {
        return new String[0];
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
        return "operator";
    }

}