package com.demo.test;

import com.demo.service.ThreadService;
import com.demo.service.ThreadServiceImpl;

public class TestThread {

    public static void main(String[] args) {

        ThreadService service = new ThreadServiceImpl();

        System.out.println("Demonstrating sleep, join, yield:");
        service.executeThreadMethods();
    }
}