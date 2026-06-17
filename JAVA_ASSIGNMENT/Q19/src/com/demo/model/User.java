package com.demo.model;


public class User {

    private String username;
    private String address;
    private String mobile;
    private String email;

    public User() {}

    public User(String username,
                String address,
                String mobile,
                String email) {

        this.username = username;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }
}