package com.demo.model;

public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " running: " + i);

            if (i == 2) {
                System.out.println(name + " is yielding...");
                Thread.yield();
            }

            try {
          
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}