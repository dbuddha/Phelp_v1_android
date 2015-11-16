package com.mkbz.phelp.database.table;

import android.provider.BaseColumns;

import com.mkbz.phelp.database.Table;

/**
 * Created by MARCELO on 15-11-2015.
 */
public class CountryTable implements Table {

    public static final String SQL_CREATE_TABLE =
            CREATE_TABLE + CountryEntry.TABLE_NAME + " (" +
                    CountryEntry.ID + INTEGER_TYPE + COMMA_SEP +
                    CountryEntry.CODE + TEXT_TYPE + COMMA_SEP +
                    CountryEntry.CODE2 + TEXT_TYPE + COMMA_SEP +
                    CountryEntry.NAME + TEXT_TYPE + COMMA_SEP +
                    PRIMARY_KEY + "(" +
                    CountryEntry.ID  +
                    ") )";
    public static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS " + CountryEntry.TABLE_NAME;

    public static final String[] COLUMNS={CountryEntry.ID,CountryEntry.CODE,CountryEntry.CODE2,CountryEntry.NAME};

    @Override
    public String getCreate() {
        return SQL_CREATE_TABLE;
    }

    @Override
    public String getDelete() {
        return SQL_DROP_TABLE;
    }



    protected static abstract class CountryEntry implements BaseColumns {
        public static final String TABLE_NAME = "country";
        public static final String ID = "id";
        public static final String CODE = "code";
        public static final String CODE2 = "code2";
        public static final String NAME = "name";
    }
}
