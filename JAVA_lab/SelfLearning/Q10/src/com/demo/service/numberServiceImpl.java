package com.demo.service;

import com.demo.dao.numberDao;
import com.demo.dao.numberDaoImpl;
import java.util.Collections;
import java.util.List;

public class numberServiceImpl implements numberService {

    numberDao dao = new numberDaoImpl();

    public void insert(int n) {
        dao.add(n);
    }

    public void delete(int n) {
        dao.remove(n);
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