package com.demo.dao;

import java.util.List;

public interface NumberDAO {
    void add(int n);
    void delete(int n);
    boolean search(int n);
    List<Integer> getAll();
}