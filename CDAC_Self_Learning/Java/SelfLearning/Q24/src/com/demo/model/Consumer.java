package com.demo.model;

public class Consumer extends Thread {

    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}