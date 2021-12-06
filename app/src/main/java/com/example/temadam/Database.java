package com.example.temadam;

import android.content.Context;

import androidx.room.Room;

public class Database {
    private static Database database;
    private DBPersoana DBPersoana;

    private Database(Context context) {
        DBPersoana = Room.databaseBuilder(context,
                DBPersoana.class, "persoana-database").build();
    }

    public static Database getInstance(Context context) {
        if (database == null) {
            database = new Database(context);
        }
        return database;
    }

    public DBPersoana getDatabase() {
        return DBPersoana;
    }
}
