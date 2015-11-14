package com.mkbz.phelp.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.mkbz.phelp.model.Model;

/**
 * Created by MARCELO on 14-11-2015.
 */

public abstract class ModelDataSource<T extends Model> extends DataSource<Model> {

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
        //return m.getId();
        return 0;
    }


    @Override
    protected ContentValues getValues(Model m) {
        //return m.getContentValues();
        return null;
    }
}
