package com.example.repository;

import com.example.model.User;

public interface UserRepository {
    User findByEmail(String email);
    User save(User user);
}
