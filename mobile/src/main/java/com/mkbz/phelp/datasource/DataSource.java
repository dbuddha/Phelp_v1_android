package com.mkbz.phelp.datasource;

/**
 * Created by MARCELO on 14-11-2015.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.mkbz.phelp.database.PhelpDbHelper;

import java.util.ArrayList;
import java.util.List;

public abstract class DataSource<T> {

    protected String[] allColumns;
    // Database fields
    private SQLiteDatabase database;
    private PhelpDbHelper dbHelper;

    protected DataSource(Context context) {
        dbHelper = new PhelpDbHelper(context);
    }


    protected abstract String getTableName();

    protected abstract String getIdName();

    protected abstract String getDTName();

    protected abstract long getIdFrom(T t);

    protected abstract T cursorToT(Cursor c);

    //new ContentValues();
    // values.put(PhelpDbHelper.COLUMN_COMMENT, USSD.java);
    protected abstract ContentValues getValues(T t);


    public T create(T t) {
        ContentValues values = getValues(t);
        long insertId = database.insert(getTableName(), null, values);

        Cursor cursor = database.query(getTableName(),
                allColumns, getIdName() + " = " + insertId, null,
                null, null, null);

        cursor.moveToFirst();

        t = cursorToT(cursor);

        cursor.close();
        return t;
    }

    public void delete(T t) {
        long id = getIdFrom(t);
        System.out.println(getDTName() + " deleted with id: " + id);
        database.delete(getTableName(), getIdName() + " = " + id, null);
    }


    public List<T> getAll() {
        List<T> list = new ArrayList<T>();

        Cursor cursor = database.query(getTableName(),
                allColumns, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            T t = cursorToT(cursor);
            list.add(t);
            cursor.moveToNext();
        }

        // make sure to close the cursor
        cursor.close();

        return list;
    }


    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }


}