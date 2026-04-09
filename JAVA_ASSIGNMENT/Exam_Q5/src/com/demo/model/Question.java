package com.demo.model;

public class Question {
    int qno;
    String question, opt1, opt2, opt3, opt4;
    int ans;
    int marks;

    public Question(int qno, String question,
                    String opt1, String opt2,
                    String opt3, String opt4,
                    int ans, int marks) {
        this.qno = qno;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.ans = ans;
        this.marks = marks;
    }
}