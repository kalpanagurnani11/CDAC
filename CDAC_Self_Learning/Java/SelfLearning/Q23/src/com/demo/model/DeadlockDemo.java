package com.demo.model;

public class DeadlockDemo {

    private final Object resource1 = "Resource1";
    private final Object resource2 = "Resource2";

    public void startDeadlock() {

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread-1 locked Resource1");

                try { Thread.sleep(100); } catch (Exception e) {}

                System.out.println("Thread-1 waiting for Resource2");
                synchronized (resource2) {
                    System.out.println("Thread-1 locked Resource2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread-2 locked Resource2");

                try { Thread.sleep(100); } catch (Exception e) {}

                System.out.println("Thread-2 waiting for Resource1");
                synchronized (resource1) {
                    System.out.println("Thread-2 locked Resource1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}