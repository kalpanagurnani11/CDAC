package com.demo.service;

import java.util.List;

public interface NumberService {
    void insert(int n);
    void remove(int n);
    boolean find(int n);
    List<Integer> all();
    void sort();
}