package com.mkbz.phelp.database.table;

import android.provider.BaseColumns;

/**
 * Created by MARCELO on 15-11-2015.
 */
public class USSDTable{


    public static final String[] COLUMNS={USSDEntry.ID,USSDEntry.CODE,USSDEntry.TITLE,USSDEntry.DESCRIPTION,USSDEntry.COUNTRY,USSDEntry.OPERATOR};



    protected static abstract class USSDEntry implements BaseColumns {
        public static final String TABLE_NAME = "ussd";
        public static final String ID = "id";
        public static final String CODE = "code";
        public static final String TITLE = "title";
        public static final String DESCRIPTION = "description";
        public static final String COUNTRY = "country_id";
        public static final String OPERATOR = "operator_id";
    }


}
