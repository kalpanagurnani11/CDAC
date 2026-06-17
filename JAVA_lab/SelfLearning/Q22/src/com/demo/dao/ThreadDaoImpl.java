package com.demo.dao;

import com.demo.model.MyThread;

public class ThreadDaoImpl implements ThreadDao {

    @Override
    public void demonstrateMethods() {

        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        t1.start();

        try {
          
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}