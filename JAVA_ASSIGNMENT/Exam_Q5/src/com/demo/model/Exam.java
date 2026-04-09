package com.demo.model;

import java.util.Scanner;

public class Exam {
    int examId;
    String name, topic, date;
    Question[] qarr;

    public Exam(int examId, String name, String topic, String date, Question[] qarr) {
        this.examId = examId;
        this.name = name;
        this.topic = topic;
        this.date = date;
        this.qarr = qarr;
    }

    public int conductExam() {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < qarr.length; i++) {
            Question q = qarr[i];

            System.out.println("\nQ" + q.qno + ": " + q.question);
            System.out.println("1. " + q.opt1);
            System.out.println("2. " + q.opt2);
            System.out.println("3. " + q.opt3);
            System.out.println("4. " + q.opt4);

            System.out.print("Enter answer: ");
            int ans = sc.nextInt();

            if (ans == q.ans) {
                total += q.marks;
            }
        }
        return total;
    }
}