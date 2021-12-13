package com.example.temadam;

public class Tweets {
    private int image;
    private String nume;
    private String user;
    private String mail;
    private String text;

    public Tweets() {
    }

    public Tweets(int image, String nume, String user, String mail, String text) {
        this.image = image;
        this.nume = nume;
        this.user = user;
        this.mail = mail;
        this.text = text;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Tweets{" +
                "image=" + image +
                ", nume='" + nume + '\'' +
                ", user='" + user + '\'' +
                ", mail='" + mail + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
