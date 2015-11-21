package com.mkbz.phelp.database.table;

import android.provider.BaseColumns;

import com.mkbz.phelp.database.Table;

/**
 * Created by MARCELO on 15-11-2015.
 */


//TODO: sql create, columns and entry are wrong
public class OperatorTable implements Table {

    public static final String SQL_CREATE_TABLE =
            CREATE_TABLE + OperatorEntry.TABLE_NAME + " (" +
                    OperatorEntry.ID + INTEGER_TYPE + COMMA_SEP +
                    OperatorEntry.CODE + TEXT_TYPE + COMMA_SEP +
                    OperatorEntry.CODE2 + TEXT_TYPE + COMMA_SEP +
                    OperatorEntry.NAME + TEXT_TYPE + COMMA_SEP +
                    PRIMARY_KEY + "(" +
                    OperatorEntry.ID  +
                    ") )";
    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS " + OperatorEntry.TABLE_NAME;

    public static final String[] COLUMNS={OperatorEntry.ID,OperatorEntry.CODE,OperatorEntry.CODE2,OperatorEntry.NAME};

    @Override
    public String getCreate() {
        return SQL_CREATE_TABLE;
    }

    @Override
    public String getDelete() {
        return SQL_DROP_TABLE;
    }

    @Override
    public String getPersistentData() {
        return "";
    }


    protected static abstract class OperatorEntry implements BaseColumns {
        public static final String TABLE_NAME = "operator";
        public static final String ID = "id";
        public static final String CODE = "code";
        public static final String CODE2 = "code2";
        public static final String NAME = "name";
    }

}
