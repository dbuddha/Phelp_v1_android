package com.mkbz.phelp.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

/**
 * Created by MARCELO on 14-11-2015.
 */

public abstract class ModelDataSource<Model> extends DataSource<Model> {

    protected String tableName;
    protected String idName;

    public ModelDataSource(Context context){
        super(context);
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
}
