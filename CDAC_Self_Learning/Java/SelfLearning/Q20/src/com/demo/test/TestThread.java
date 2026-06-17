package com.demo.test;

import com.demo.service.ThreadService;
import com.demo.service.ThreadServiceImpl;

public class TestThread {

    public static void main(String[] args) {

        ThreadService service = new ThreadServiceImpl();

        System.out.println("Using Thread Class:");
        service.runThreadExample();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nUsing Runnable Interface:");
        service.runRunnableExample();
    }
}