package com.mkbz.phelp.model;

import android.content.ContentValues;
import android.database.Cursor;

/**
 * Created by MARCELO on 14-11-2015.
 */
public abstract class Model {


    public static final String ID = "id" ;

    protected long id;

    public long getId() {
        return id;
    }

    public abstract ContentValues getContentValues();

    public abstract String[] getAllColumns() ;

    public abstract <T extends Model> T createFromCursor(Cursor c);

}
