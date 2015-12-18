package com.mkbz.phelp.model;

import android.content.ContentValues;
import android.database.Cursor;

import com.mkbz.phelp.database.table.FavoriteTable;

public class Favorite extends Model {


    public static final String TABLE = "favorite" ;
    private String type;
    private int fk;
    private String code;
    private String title;
    private String description;

    public Favorite() {

    }
    public Favorite(Cursor c) {
        id=c.getLong(0);
        type=c.getString(1);
        fk=c.getInt(2);
        code=c.getString(3);
        title=c.getString(4);
        description=c.getString(5);
    }


    @Override
    public ContentValues getContentValues() {
        return null;
    }


    @Override
    public String[] getAllColumns() {
        return FavoriteTable.COLUMNS;
    }

    @Override
    public Favorite createFromCursor(Cursor c) {
        return new Favorite(c);
    }

    public void setId(long id) {
        this.id = id;
    }


    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return TABLE;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}