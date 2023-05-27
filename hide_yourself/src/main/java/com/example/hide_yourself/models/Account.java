package com.example.hide_yourself.models;
import java.sql.Timestamp;

public class Account {
    private long userId;
    private String username;
    private String password;
    private String email;
    private Timestamp createdOn;
    private Timestamp lastLogin;

    public Account(){}

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.createdOn = new Timestamp(System.currentTimeMillis());
    }

    public long getUserId(){
        return this.userId;
    }

    public String getUsername(){
        return this.username;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public Timestamp getLastlogin() {
        return this.lastLogin;
    }

    public void setLastLogin(Timestamp timestamp) {
        this.lastLogin = timestamp;
    }
}
