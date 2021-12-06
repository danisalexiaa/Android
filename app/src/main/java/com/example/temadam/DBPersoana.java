package com.example.temadam;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities={Persoana.class}, version = 1, exportSchema = false)
public abstract class DBPersoana extends RoomDatabase {
    public abstract PersoanaDAO persoanaDAO();

}
