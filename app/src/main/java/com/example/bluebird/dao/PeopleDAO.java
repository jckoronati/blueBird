package com.example.bluebird.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

public class PeopleDAO {
    private static String TABLE_PEOPLE = "PEOPLE";
    private DBGateway dbGateway;

    public PeopleDAO(Context context) {
        dbGateway = DBGateway.getInstance(context);
    }

    private int getCount() {
        Cursor cursor = dbGateway.getDatabase().rawQuery("SELECT COUNT(*) FROM PEOPLE", null);
        cursor.moveToFirst();

        int countRow = cursor.getInt(0);
        cursor.close();

        return countRow;
    }

    public boolean create(String name, String fantasyName, String gender, String father, String mother, double income) throws Exception {
        ContentValues contentValues = new ContentValues();

        if(isDataExist(name) && getCount() > 0) {
            throw new Exception("os dados não foram informados corretamente!");
        }

        contentValues.put("NAME", name);
        contentValues.put("FANTASYNAME", fantasyName);
        contentValues.put("GENDER", gender);
        contentValues.put("FATHER", father);
        contentValues.put("MOTHER", mother);
        contentValues.put("INCOME", income);

        return dbGateway.getDatabase().insert(TABLE_PEOPLE, null, contentValues) > 0;
    }

    public boolean isDataExist(String name) {
        int records = 0;

        try {
            Cursor cursor = dbGateway.getDatabase().rawQuery("SELECT * FROM PEOPLE WHERE UPPER(NAME) = ?", new String[]{name.toUpperCase()});
            records = cursor.getCount();
            cursor.close();

            return records > 0 ? true : false;
        } catch (Exception e) {
            Log.d("error", e.getMessage().toString());
        }

        return false;
    }
}
