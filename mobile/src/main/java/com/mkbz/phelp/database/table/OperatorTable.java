package com.mkbz.phelp.database.table;

import android.provider.BaseColumns;

/**
 * Created by MARCELO on 15-11-2015.
 */


//TODO: sql create, columns and entry are wrong
public class OperatorTable {

    public static final String[] COLUMNS={OperatorEntry.ID,OperatorEntry.NETWORK_CODE,OperatorEntry.NAME,OperatorEntry.COUNTRY};



    protected static abstract class OperatorEntry implements BaseColumns {
        public static final String TABLE_NAME = "operator";
        public static final String ID = "id";
        public static final String NETWORK_CODE = "network_code";
        public static final String NAME = "name";
        public static final String COUNTRY = "country_id";
    }


}
