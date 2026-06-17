package com.demo.test;

import com.demo.service.VectorService;
import com.demo.service.VectorServiceImpl;

import java.util.Scanner;

public class TestVector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VectorService service = new VectorServiceImpl();

        service.add("Java");
        service.add("Python");
        service.add("C++");
        service.add("Spring Boot");

        System.out.println("Vector Elements:");

        service.display();
    }
}