package com.demo.model;

public class Producer extends Thread {

    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}