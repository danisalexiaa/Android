package com.example.temadam;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PersoanaDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(Persoana... persoana);

    @Delete
    void delete(Persoana persoana);

    @Query("SELECT * FROM Persoana")
    public List<Persoana> getAll();

    @Query("SELECT * FROM Persoana WHERE length(Email) > length(:Email)")
    List<Persoana> getPersoanaNume(String Email);

}
