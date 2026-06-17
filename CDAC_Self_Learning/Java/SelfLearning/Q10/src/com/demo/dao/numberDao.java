package com.demo.dao;

import java.util.List;

public interface numberDao {
    void add(int n);
    void remove(int n);
    boolean search(int n);
    List<Integer> getAll();
}