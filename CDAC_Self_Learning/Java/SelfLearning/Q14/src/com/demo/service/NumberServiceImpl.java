package com.demo.service;

import com.demo.dao.NumberDAO;
import com.demo.dao.NumberDAOImpl;
import java.util.Collections;
import java.util.List;

public class NumberServiceImpl implements NumberService {

    NumberDAO dao = new NumberDAOImpl();

    public void insert(int n) {
        dao.add(n);
    }

    public void remove(int n) {
        dao.delete(n);
    }

    public boolean find(int n) {
        return dao.search(n);
    }

    public List<Integer> all() {
        return dao.getAll();
    }

    public void sort() {
        Collections.sort(dao.getAll());
    }
}