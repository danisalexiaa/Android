package com.example.temadam;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "Persoana")

public class Persoana implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "first name")
    private String FirstName;

    @ColumnInfo(name = "Email")
    private String Email;

    @ColumnInfo(name = "Date of Birth")
    private String dob;

    @ColumnInfo(name = "Password")
    private String Password;

    public Persoana(String firstName, String email, String dob, String password) {
        FirstName = firstName;
        Email = email;
        this.dob = dob;
        Password = password;
    }

    public Persoana() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "id='" + id + '\'' +
                "FirstName='" + FirstName + '\'' +
                ", Email='" + Email + '\'' +
                ", dob='" + dob + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
