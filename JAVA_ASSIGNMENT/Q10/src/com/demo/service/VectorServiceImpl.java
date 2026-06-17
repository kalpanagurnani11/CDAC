package com.demo.service;

import com.demo.dao.VectorDao;
import com.demo.dao.VectorDaoImpl;

import java.util.Enumeration;
import java.util.Vector;

public class VectorServiceImpl implements VectorService {

    private VectorDao dao = new VectorDaoImpl();

    @Override
    public void add(String s) {
        dao.addString(s);
    }

    @Override
    public void display() {
        Vector<String> v = dao.getAll();

        Enumeration<String> e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}