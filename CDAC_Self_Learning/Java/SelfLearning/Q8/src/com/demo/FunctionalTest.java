package com.demo;

public class FunctionalTest {
    public static void main(String[] args) {
        Message m1 = new Message() {
            public void show(String msg) {
                System.out.println(msg);
            }
        };

        Message m2 = (msg) -> System.out.println(msg);

        m1.show("Hello");
        m2.show("Lambda Expression");
    }
}
