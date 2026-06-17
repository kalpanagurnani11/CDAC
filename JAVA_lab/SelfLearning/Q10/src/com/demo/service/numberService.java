package com.demo.service;

import java.util.List;

public interface numberService {
    void insert(int n);
    void delete(int n);
    boolean find(int n);
    List<Integer> all();
    void sort();
}