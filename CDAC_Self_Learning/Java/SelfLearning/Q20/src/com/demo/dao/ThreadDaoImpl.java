package com.demo.dao;

import com.demo.model.MyRunnable;
import com.demo.model.MyThread;

public class ThreadDaoImpl implements ThreadDao {

    @Override
    public void executeThreadClass() {
        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");

        t1.start();
        t2.start();
    }

    @Override
    public void executeRunnable() {
        Thread t1 = new Thread(new MyRunnable("R1"));
        Thread t2 = new Thread(new MyRunnable("R2"));

        t1.start();
        t2.start();
    }
}