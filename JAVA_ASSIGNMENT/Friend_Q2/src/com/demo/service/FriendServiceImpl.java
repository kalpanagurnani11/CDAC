package com.demo.service;

import com.demo.dao.FriendDao;
import com.demo.dao.FriendDaoImpl;
import com.demo.model.Friend;

public class FriendServiceImpl implements FriendService {

    private FriendDao dao = new FriendDaoImpl();

    @Override
    public void addFriend(Friend f) {
        dao.addFriend(f);
    }

    @Override
    public Friend[] getAllFriends() {
        return dao.getAllFriends();
    }

    @Override
    public Friend searchById(int id) {
        return dao.searchById(id);
    }

    @Override
    public Friend[] searchByName(String name) {
        return dao.searchByName(name);
    }

    @Override
    public Friend[] searchByHobby(String hobby) {
        return dao.searchByHobby(hobby);
    }
}