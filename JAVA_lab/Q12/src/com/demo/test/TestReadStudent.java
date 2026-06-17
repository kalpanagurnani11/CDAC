package com.demo.test;

import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestReadStudent {
    public static void main(String[] args) {

        StudentService service = new StudentServiceImpl();

        service.displayFromFile();
    }
}