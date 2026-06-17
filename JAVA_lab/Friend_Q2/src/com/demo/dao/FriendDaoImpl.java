package com.demo.dao;

import com.demo.model.Friend;

public class FriendDaoImpl implements FriendDao {

    private Friend[] arr = new Friend[50];
    private int count = 0;

    @Override
    public void addFriend(Friend f) {
        arr[count++] = f;
    }

    @Override
    public Friend[] getAllFriends() {
        return arr;
    }

    @Override
    public Friend searchById(int id) {
        for (int i = 0; i < count; i++) {
            if (arr[i].getId() == id) {
                return arr[i];
            }
        }
        return null;
    }

    @Override
    public Friend[] searchByName(String name) {
        Friend[] result = new Friend[50];
        int idx = 0;

        for (int i = 0; i < count; i++) {
            if (arr[i].getName().equalsIgnoreCase(name)) {
                result[idx++] = arr[i];
            }
        }
        return result;
    }

    @Override
    public Friend[] searchByHobby(String hobby) {
        Friend[] result = new Friend[50];
        int idx = 0;

        for (int i = 0; i < count; i++) {
            String[] h = arr[i].getHobbies();

            for (String hb : h) {
                if (hb.equalsIgnoreCase(hobby)) {
                    result[idx++] = arr[i];
                    break;
                }
            }
        }
        return result;
    }
}