package com.example.bluebird.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "DBAgenda.db";
    private static final int DATABASE_VERSION = 1;
    //campo livre para o usuário informar seu género
    private static final String CREATE_TABLE_SING = "CREATE TABLE AGENDA(ID INTEGER PRIMARY KEY, NOME TEXT NOT NULL, GENERO TEXT NOT NULL)";

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
