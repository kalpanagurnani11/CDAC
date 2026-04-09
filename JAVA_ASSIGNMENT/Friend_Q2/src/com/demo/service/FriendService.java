package com.demo.service;

import com.demo.model.Friend;

public interface FriendService {
    void addFriend(Friend f);
    Friend[] getAllFriends();
    Friend searchById(int id);
    Friend[] searchByName(String name);
    Friend[] searchByHobby(String hobby);
}