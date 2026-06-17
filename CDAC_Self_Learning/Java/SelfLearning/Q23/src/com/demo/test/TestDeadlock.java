package com.demo.test;

import com.demo.service.DeadlockService;
import com.demo.service.DeadlockServiceImpl;

public class TestDeadlock {

    public static void main(String[] args) {

        DeadlockService service = new DeadlockServiceImpl();

        System.out.println("Starting Deadlock Demo...");
        service.runDeadlockExample();
    }
}