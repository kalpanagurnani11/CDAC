package com.demo.dao;


import com.demo.model.User;

public interface UserDao {

    User searchUser(String username,
                    String address);

    void addUser(User user);
}


