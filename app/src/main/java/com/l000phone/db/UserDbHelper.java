package com.l000phone.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2016/11/21.
 */

public class UserDbHelper extends SQLiteOpenHelper {

    static String name = "user.db";
    static int dbVersion = 1;

    public UserDbHelper(Context context) {
        super(context, name, null, dbVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table user(id integer primary key autoincrement," +
                "username varchar(20),password varchar(20))";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
