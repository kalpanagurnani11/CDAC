package com.demo.service;

import com.demo.dao.DeadlockDao;
import com.demo.dao.DeadlockDaoImpl;

public class DeadlockServiceImpl implements DeadlockService {

    private DeadlockDao dao = new DeadlockDaoImpl();

    @Override
    public void runDeadlockExample() {
        dao.executeDeadlock();
    }
}