package com.demo.test;

import com.demo.service.GradeService;
import com.demo.service.GradeServiceImpl;

import java.util.Scanner;

public class TestGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GradeService service = new GradeServiceImpl();

        System.out.print("Enter Grade (Distinction/First/Second/Pass/Fail): ");
        String grade = sc.next();

        service.showRange(grade);
    }
}