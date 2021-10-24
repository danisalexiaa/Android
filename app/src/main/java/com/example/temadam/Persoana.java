package com.example.temadam;

import java.io.Serializable;

public class Persoana implements Serializable {
    private String FirstName;
    private String Email;
    private String dob;
    private String Password;

    public Persoana(String firstName, String email, String dob, String password) {
        FirstName = firstName;
        Email = email;
        this.dob = dob;
        Password = password;
    }

    public Persoana() {
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
                "FirstName='" + FirstName + '\'' +
                ", Email='" + Email + '\'' +
                ", dob='" + dob + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
