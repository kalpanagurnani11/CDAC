package com.demo.service;

import com.demo.dao.PCDao;
import com.demo.dao.PCDaoImpl;

public class PCServiceImpl implements PCService {

    private PCDao dao = new PCDaoImpl();

    @Override
    public void runExample() {
        dao.executeProducerConsumer();
    }
}