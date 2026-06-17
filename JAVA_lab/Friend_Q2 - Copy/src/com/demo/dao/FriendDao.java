package com.demo.dao;

import com.demo.model.Friend;

public interface FriendDao {
    void addFriend(Friend f);
    Friend[] getAllFriends();
    Friend searchById(int id);
    Friend[] searchByName(String name);
    Friend[] searchByHobby(String hobby);
}