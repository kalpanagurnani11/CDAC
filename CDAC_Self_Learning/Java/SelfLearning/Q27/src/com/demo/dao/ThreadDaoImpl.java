package com.demo.dao;

public class ThreadDaoImpl implements ThreadDao {

    public void createThreads() {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread 1 running");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread 2 running");
            }
        });

        t1.start();
        t2.start();
    }
}