package com.example.test_javafx.models;

public class User {
    private String username = "admin";
    private String password= "123456789";

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User() {

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}