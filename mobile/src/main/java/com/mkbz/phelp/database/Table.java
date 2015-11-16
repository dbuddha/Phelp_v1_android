package com.mkbz.phelp.database;

/**
 * Created by MARCELO on 15-11-2015.
 */
public interface Table {
    public static final String CREATE_TABLE = "CREATE TABLE ";

    public static final String TEXT_TYPE = " TEXT ";
    public static final String INTEGER_TYPE = " INTEGER ";
    public static final String AUTOINCREMENT = " AUTOINCREMENT ";
    public static final String REAL = " REAL ";
    public static final String COMMA_SEP = ",";

    public static final String PRIMARY_KEY = " PRIMARY KEY ";
    public static final String FOREIGN_KEY = " FOREIGN KEY ( ";
    public static final String REFERENCES = " ) REFERENCES ";

    String getCreate();

    String getDelete();
}
