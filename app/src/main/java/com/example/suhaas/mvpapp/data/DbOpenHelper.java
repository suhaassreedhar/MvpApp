package com.example.suhaas.mvpapp.data;

import android.content.Context;

import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;

/**
 * Created by suhaas on 14/7/17.
 */

public class DbOpenHelper extends DatabaseOpenHelper {

    public DbOpenHelper(Context context, String name, int version) {
        super(context, name, version);
    }

    @Override
    public void onCreate(Database db) {
        db.execSQL("");

    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + "");
        onCreate(db);

    }
}
