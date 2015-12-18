package com.mkbz.phelp.database.table;

import android.provider.BaseColumns;

/**
 * Created by MARCELO on 15-11-2015.
 */

//TODO: sql create, columns and entry are wrong

public class FavoriteTable {

    public static final String[] COLUMNS={FavoriteEntry.ID, FavoriteEntry.TYPE, FavoriteEntry.FK, FavoriteEntry.CODE, FavoriteEntry.TITLE, FavoriteEntry.DESCRIPTION};


    protected static abstract class FavoriteEntry implements BaseColumns {
        public static final String TABLE_NAME = "favorite";
        public static final String ID = "id";
        public static final String TYPE = "type";
        public static final String FK = "fk";
        public static final String CODE = "code";
        public static final String TITLE = "title";
        public static final String DESCRIPTION = "description";

    }
}
