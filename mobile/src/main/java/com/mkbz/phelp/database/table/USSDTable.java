package com.mkbz.phelp.database.table;

import android.provider.BaseColumns;

import com.mkbz.phelp.database.Table;

/**
 * Created by MARCELO on 15-11-2015.
 */
public class USSDTable implements Table {



    private static final String DEBUG_TAG = "USSDTable";
    public static final String SQL_CREATE_TABLE =
        CREATE_TABLE + USSDEntry.TABLE_NAME + " (" +
                USSDEntry.ID + INTEGER_TYPE + COMMA_SEP +
                USSDEntry.TITLE + TEXT_TYPE + COMMA_SEP +
                USSDEntry.DESCRIPTION + TEXT_TYPE + COMMA_SEP +
                USSDEntry.CODE + TEXT_TYPE + COMMA_SEP +
                PRIMARY_KEY + "(" +
                USSDEntry.ID  +
                ") )";
    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS " + USSDEntry.TABLE_NAME;

    public static final String[] COLUMNS={USSDEntry.ID,USSDEntry.TITLE,USSDEntry.DESCRIPTION,USSDEntry.CODE};

    @Override
    public String getCreate() {
        return SQL_CREATE_TABLE;
    }

    @Override
    public String getDelete() {
        return SQL_DROP_TABLE;
    }


    public USSDTable() {

    }

    protected static abstract class USSDEntry implements BaseColumns {
        public static final String TABLE_NAME = "ussd";
        public static final String ID = "id";
        public static final String TITLE = "title";
        public static final String DESCRIPTION = "description";
        public static final String CODE = "code";
    }


}
