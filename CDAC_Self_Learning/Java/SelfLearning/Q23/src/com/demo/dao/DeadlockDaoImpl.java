package com.demo.dao;

import com.demo.model.DeadlockDemo;

public class DeadlockDaoImpl implements DeadlockDao {

    @Override
    public void executeDeadlock() {
        DeadlockDemo demo = new DeadlockDemo();
        demo.startDeadlock();
    }
}