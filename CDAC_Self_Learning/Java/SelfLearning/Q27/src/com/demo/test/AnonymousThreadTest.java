package com.demo.test;

import com.demo.service.ThreadService;
import com.demo.service.ThreadServiceImpl;

public class AnonymousThreadTest {
    public static void main(String[] args) {
        ThreadService service = new ThreadServiceImpl();
        service.startThreads();
    }
}