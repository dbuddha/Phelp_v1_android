package com.mkbz.phelp.database.table;

import android.provider.BaseColumns;

import com.mkbz.phelp.database.Table;

/**
 * Created by MARCELO on 15-11-2015.
 */

//TODO: sql create, columns and entry are wrong

public class EmergencyTable implements Table {

    public static final String SQL_CREATE_TABLE =
            CREATE_TABLE + EmergencyEntry.TABLE_NAME + " (" +
                    EmergencyEntry.ID + INTEGER_TYPE + COMMA_SEP +
                    EmergencyEntry.CODE + TEXT_TYPE + COMMA_SEP +
                    EmergencyEntry.CODE2 + TEXT_TYPE + COMMA_SEP +
                    EmergencyEntry.NAME + TEXT_TYPE + COMMA_SEP +
                    PRIMARY_KEY + "(" +
                    EmergencyEntry.ID  +
                    ") )";
    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS " + EmergencyEntry.TABLE_NAME;

    public static final String[] COLUMNS={EmergencyEntry.ID,EmergencyEntry.CODE,EmergencyEntry.CODE2,EmergencyEntry.NAME};

    @Override
    public String getCreate() {
        return SQL_CREATE_TABLE;
    }

    @Override
    public String getDelete() {
        return SQL_DROP_TABLE;
    }



    protected static abstract class EmergencyEntry implements BaseColumns {
        public static final String TABLE_NAME = "emergency";
        public static final String ID = "id";
        public static final String CODE = "code";
        public static final String CODE2 = "code2";
        public static final String NAME = "name";
    }
}
