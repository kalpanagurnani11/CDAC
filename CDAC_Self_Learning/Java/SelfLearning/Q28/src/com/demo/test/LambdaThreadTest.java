package com.demo.test;

import com.demo.service.LambdaThreadService;
import com.demo.service.LambdaThreadServiceImpl;

public class LambdaThreadTest {

    public static void main(String[] args) {
        LambdaThreadService service = new LambdaThreadServiceImpl();
        service.execute();
    }
}