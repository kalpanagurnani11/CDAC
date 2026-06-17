package com.demo.test;

import com.demo.service.numberService;
import com.demo.service.numberServiceImpl;

public class NumberTest {
    public static void main(String[] args) {
        numberService s = new numberServiceImpl();

        s.insert(50);
        s.insert(10);
        s.insert(30);
        s.insert(20);

        s.delete(30);

        System.out.println(s.find(20));

        s.sort();

        System.out.println(s.all());
    }
}