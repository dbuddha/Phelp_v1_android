package com.mkbz.phelp.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.mkbz.phelp.model.Model;

/**
 * Created by MARCELO on 14-11-2015.
 */

public class ModelDataSource<T extends Model> extends DataSource<T> {

    protected final String tableName;
    protected final String idName;
    private final T clazz;

    public ModelDataSource(Context context, String tableName, String idName, T clazz) {
        super(context);
        this.tableName = tableName;
        this.idName = idName;
        this.clazz = clazz;
        this.allColumns = getAllColumns();
    }

    private String[] getAllColumns() {
        return clazz.getAllColumns();
    }

    @Override
    protected String getTableName() {
        return tableName;
    }

    @Override
    protected String getIdName() {
        return idName;
    }

    @Override
    protected String getDTName() {
        return tableName;
    }

    @Override
    protected long getIdFrom(Model m) {
        return m.getId();
    }

    @Override
    protected ContentValues getValues(Model m) {
        return m.getContentValues();
    }

    @Override
    protected T cursorToT(Cursor c) {
        return clazz.createFromCursor(c);
    }
}
