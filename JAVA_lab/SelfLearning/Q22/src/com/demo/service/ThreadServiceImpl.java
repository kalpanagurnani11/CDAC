package com.demo.service;

import com.demo.dao.ThreadDao;
import com.demo.dao.ThreadDaoImpl;

public class ThreadServiceImpl implements ThreadService {

    private ThreadDao dao = new ThreadDaoImpl();

    @Override
    public void executeThreadMethods() {
        dao.demonstrateMethods();
    }
}