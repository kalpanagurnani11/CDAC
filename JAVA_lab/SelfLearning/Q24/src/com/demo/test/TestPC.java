package com.demo.test;

import com.demo.service.PCService;
import com.demo.service.PCServiceImpl;

public class TestPC {

    public static void main(String[] args) {

        PCService service = new PCServiceImpl();

        System.out.println("Producer-Consumer using wait/notify:");
        service.runExample();
    }
}