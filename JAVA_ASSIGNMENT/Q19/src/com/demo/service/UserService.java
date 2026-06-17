package com.demo.service;


import com.demo.model.User;

public interface UserService {

    User searchUser(String username,
                    String address);

    void addUser(User user);
}