package com.demo.test;

import java.util.Scanner;
import com.demo.model.Question;
import com.demo.model.Exam;

public class TestExam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Java Questions
        Question[] javaQ = new Question[5];
        javaQ[0] = new Question(1,"Java is?","Language","Car","Food","Animal",1,1);
        javaQ[1] = new Question(2,"Extension?","java","txt","pdf","doc",1,1);
        javaQ[2] = new Question(3,"Keyword?","class","apple","dog","pen",1,1);
        javaQ[3] = new Question(4,"Runs on?","JVM","TV","Mobile","Fan",1,1);
        javaQ[4] = new Question(5,"Java is?","Programming","Cooking","Dance","Sing",1,1);

        // HTML Questions
        Question[] htmlQ = new Question[5];
        htmlQ[0] = new Question(1,"HTML used for?","Web","Cook","Drive","Game",1,1);
        htmlQ[1] = new Question(2,"Full form?","HyperText Markup Language","None","Other","All",1,1);
        htmlQ[2] = new Question(3,"Paragraph tag?","p","h1","div","a",1,1);
        htmlQ[3] = new Question(4,"Link tag?","a","img","table","ul",1,1);
        htmlQ[4] = new Question(5,"Image tag?","img","pic","image","src",1,1);

        // Exam Objects
        Exam javaExam = new Exam(1, "Java", "Core", "Today", javaQ);
        Exam htmlExam = new Exam(2, "HTML", "Web", "Today", htmlQ);

        char ch;

        do {
            System.out.println("\n1. Java Exam");
            System.out.println("2. HTML Exam");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            int marks = 0;

            if (choice == 1) {
                marks = javaExam.conductExam();
            } else if (choice == 2) {
                marks = htmlExam.conductExam();
            } else {
                System.out.println("Wrong choice");
            }

            System.out.println("Marks: " + marks);

            if (marks >= 3)
                System.out.println("Congrats u completed the test");
            else
                System.out.println("Better luck next time");

            System.out.print("Do you want to continue (y/n): ");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        sc.close();
    }
}