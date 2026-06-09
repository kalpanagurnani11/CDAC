package com.demo.dao;

public class LambdaThreadDaoImpl implements LambdaThreadDao {

    public void runThreads() {

        Thread t1 = new Thread(() -> System.out.println("Lambda Thread 1 running"));

        Thread t2 = new Thread(() -> System.out.println("Lambda Thread 2 running"));

        t1.start();
        t2.start();
    }
}