package com.demo.test;

import java.util.*;
import com.demo.service.*;

public class TestStudent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentServiceImpl();

        int ch;

        do {
            System.out.println("\n1 Add Student");
            System.out.println("2 Add Skill");
            System.out.println("3 Delete Student");
            System.out.println("4 Delete Skill");
            System.out.println("5 Display by Skill");
            System.out.println("6 Display by Degree");
            System.out.println("7 Exit");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter id name bdate degree marks: ");
                    service.addStudent(sc.nextInt(), sc.next(),
                            sc.next(), sc.next(), sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter student id and skill: ");
                    service.addSkill(sc.nextInt(), sc.next());
                    break;

                case 3:
                    System.out.print("Enter id: ");
                    System.out.println(service.deleteStudent(sc.nextInt()));
                    break;

                case 4:
                    System.out.print("Enter id and skill: ");
                    System.out.println(service.deleteSkill(sc.nextInt(), sc.next()));
                    break;

                case 5:
                    System.out.print("Enter skill: ");
                    for (String s : service.displayBySkill(sc.next()))
                        System.out.println(s);
                    break;

                case 6:
                    System.out.print("Enter degree: ");
                    for (String s : service.displayByDegree(sc.next()))
                        System.out.println(s);
                    break;

                case 7:
                    System.out.println("Exit");
            }

        } while (ch != 7);

        sc.close();
    }
}