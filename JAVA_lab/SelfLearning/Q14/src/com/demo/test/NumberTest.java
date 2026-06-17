package com.demo.test;

import com.demo.service.NumberService;
import com.demo.service.NumberServiceImpl;

public class NumberTest {
    public static void main(String[] args) {

        NumberService s = new NumberServiceImpl();

        s.insert(50);
        s.insert(10);
        s.insert(30);
        s.insert(20);

        s.remove(30);

        System.out.println(s.find(20));

        s.sort();

        System.out.println(s.all());
    }
}