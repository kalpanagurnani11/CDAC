package com.demo.dao;

import java.util.*;

public class numberDaoImpl implements numberDao {

    List<Integer> list = new ArrayList<>();

    public void add(int n) {
        list.add(n);
    }

    public void remove(int n) {
        list.remove(Integer.valueOf(n));
    }

    public boolean search(int n) {
        return list.contains(n);
    }

    public List<Integer> getAll() {
        return list;
    }
}