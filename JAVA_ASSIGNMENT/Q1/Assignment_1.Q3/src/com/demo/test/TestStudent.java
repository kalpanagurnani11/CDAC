package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.model.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class TestStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentServiceImpl();

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Search by Name");
            System.out.println("5. Calculate GPA");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter M1 M2 M3: ");
                    double m1 = sc.nextDouble();
                    double m2 = sc.nextDouble();
                    double m3 = sc.nextDouble();

                    Student s = new Student(id, name, m1, m2, m3);
                    service.addStudent(s);
                    break;

                case 2:
                    List<Student> list = service.getAllStudents();
                    for (Student st : list) {
                        System.out.println(st);
                    }
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int sid = sc.nextInt();
                    Student st = service.searchById(sid);
                    System.out.println(st != null ? st : "Not Found");
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String sname = sc.nextLine();

                    List<Student> result = service.searchByName(sname);
                    for (Student stu : result) {
                        System.out.println(stu);
                    }
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    int gid = sc.nextInt();

                    double gpa = service.calculateGPA(gid);
                    if (gpa != -1)
                        System.out.println("GPA = " + gpa);
                    else
                        System.out.println("Student Not Found");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;
            }

        } while (choice != 6);

        sc.close();
    }
}