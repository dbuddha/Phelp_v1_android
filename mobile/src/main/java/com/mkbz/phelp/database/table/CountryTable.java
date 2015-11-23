package com.mkbz.phelp.database.table;

import android.provider.BaseColumns;

import com.mkbz.phelp.database.Table;

/**
 * Created by MARCELO on 15-11-2015.
 */
public class CountryTable implements Table {


    public static final String[] COLUMNS={CountryEntry.ID,CountryEntry.CODE,CountryEntry.CODE2,CountryEntry.NAME};




    protected static abstract class CountryEntry implements BaseColumns {
        public static final String TABLE_NAME = "country";
        public static final String ID = "id";
        public static final String CODE = "code";
        public static final String CODE2 = "code2";
        public static final String NAME = "name";
    }
}
