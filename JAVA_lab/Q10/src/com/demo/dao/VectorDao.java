package com.demo.dao;

import java.util.Vector;

public interface VectorDao {
    void addString(String s);
    Vector<String> getAll();
}