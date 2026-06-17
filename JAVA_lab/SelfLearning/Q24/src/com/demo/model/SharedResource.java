package com.demo.model;

public class SharedResource {

    private int data;
    private boolean hasData = false;

  
    public synchronized void produce(int value) {

        while (hasData) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        data = value;
        System.out.println("Produced: " + data);
        hasData = true;

        notify(); 
    }

   
    public synchronized void consume() {

        while (!hasData) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed: " + data);
        hasData = false;

        notifyAll(); 
    }
}