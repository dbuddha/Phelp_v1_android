package com.mkbz.phelp.datasource;

/**
 * Created by MARCELO on 14-11-2015.
 */
import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.mkbz.phelp.database.MySQLiteHelper;

public abstract class DataSource<T> {

    // Database fields
    private SQLiteDatabase database;
    private MySQLiteHelper dbHelper;
    protected String[] allColumns;

    protected DataSource(Context context) {
        dbHelper = new MySQLiteHelper();
       // database = new SQLiteDatabase();
    }


    protected abstract String getTableName();
    protected abstract String getIdName();
    protected abstract String getDTName();
    protected abstract long getIdFrom(T t) ;
    protected abstract T cursorToT(Cursor c);
    //new ContentValues();
    // values.put(MySQLiteHelper.COLUMN_COMMENT, ussd);
    protected abstract ContentValues getValues(T t);



    public T create(T t) {
        ContentValues values = getValues(t);
        long insertId = database.insert(getTableName(), null,values);

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
        database.delete(getTableName(),  getIdName()+ " = " + id, null);
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
        //database = dbHelper.getWritableDatabase();
    }

    public void close() {
        //dbHelper.close();
    }


}