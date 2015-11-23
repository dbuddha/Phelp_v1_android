package com.mkbz.phelp.database.table;

import android.provider.BaseColumns;

import com.mkbz.phelp.database.Table;

/**
 * Created by MARCELO on 15-11-2015.
 */

//TODO: sql create, columns and entry are wrong

public class EmergencyTable implements Table {

    public static final String[] COLUMNS={EmergencyEntry.ID,EmergencyEntry.CODE,EmergencyEntry.TITLE,EmergencyEntry.DESCRIPTION,EmergencyEntry.COUNTRY};


    protected static abstract class EmergencyEntry implements BaseColumns {
        public static final String TABLE_NAME = "emergency";
        public static final String ID = "id";
        public static final String CODE = "code";
        public static final String TITLE = "title";
        public static final String DESCRIPTION = "description";
        public static final String COUNTRY = "country_id";

    }
}
