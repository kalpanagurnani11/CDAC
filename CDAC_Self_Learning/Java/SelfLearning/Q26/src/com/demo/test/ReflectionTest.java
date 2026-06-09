package com.demo.test;

import com.demo.service.SecretService;
import com.demo.service.SecretServiceImpl;

public class ReflectionTest {
    public static void main(String[] args) {
        SecretService service = new SecretServiceImpl();
        service.execute();
    }
}