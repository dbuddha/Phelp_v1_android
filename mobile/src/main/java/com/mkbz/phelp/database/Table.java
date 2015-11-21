package com.mkbz.phelp.database;

/**
 * Created by MARCELO on 15-11-2015.
 */
public interface Table {
    String CREATE_TABLE = "CREATE TABLE ";

    String TEXT_TYPE = " TEXT ";
    String INTEGER_TYPE = " INTEGER ";
    String AUTOINCREMENT = " AUTOINCREMENT ";
    String REAL = " REAL ";
    String COMMA_SEP = ",";

    String PRIMARY_KEY = " PRIMARY KEY ";
    String FOREIGN_KEY = " FOREIGN KEY ( ";
    String REFERENCES = " ) REFERENCES ";

    String getCreate();

    String getDelete();

    String getPersistentData();
}
