package com.demo.test;

import com.demo.model.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentServiceImpl();

        while (true) {
            System.out.println("\n1.Add Student 2.Exit & Save");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    System.out.print("Name: ");
                    String name = sc.next();

                    System.out.print("Degree: ");
                    String degree = sc.next();

                    System.out.print("Email: ");
                    String email = sc.next();

                    service.addStudent(new Student(id, name, degree, email));
                    break;

                case 2:
                    service.exitAndSave();
                    return;
            }
        }
    }
}