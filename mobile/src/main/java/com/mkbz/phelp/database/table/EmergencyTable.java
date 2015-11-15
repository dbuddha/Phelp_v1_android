package com.mkbz.phelp.database.table;

import com.mkbz.phelp.database.Table;

/**
 * Created by MARCELO on 15-11-2015.
 */
public class EmergencyTable implements Table {

    private static final String DATABASE_CREATE = "";
    private static final String DATABASE_DELETE = "";

    @Override
    public String getCreate() {
        return DATABASE_CREATE;
    }

    @Override
    public String getDelete() {
        return DATABASE_DELETE;
    }
}
