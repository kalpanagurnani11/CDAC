package com.demo.dao;

import java.util.*;

public class VectorDaoImpl implements VectorDao {

    private Vector<String> vector = new Vector<>();

    @Override
    public void addString(String s) {
        vector.add(s);
    }

    @Override
    public Vector<String> getAll() {
        return vector;
    }
}