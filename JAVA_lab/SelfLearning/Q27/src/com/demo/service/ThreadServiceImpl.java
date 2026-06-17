package com.demo.service;

import com.demo.dao.ThreadDao;
import com.demo.dao.ThreadDaoImpl;

public class ThreadServiceImpl implements ThreadService {

    ThreadDao dao = new ThreadDaoImpl();

    public void startThreads() {
        dao.createThreads();
    }
}