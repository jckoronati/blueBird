package com.example.bluebird.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    //Criar banco
    private static final String DATABASE_NAME = "DBBlueBird.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_TABLE_PEOPLE = "CREATE TABLE PEOPLE(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT NOT NULL, FANTASYNAME TEXT, GENDER TEXT NOT NULL, FATHER TEXT, MOTHER TEXT, INCOME DOUBLE NOT NULL)";

    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_PEOPLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
