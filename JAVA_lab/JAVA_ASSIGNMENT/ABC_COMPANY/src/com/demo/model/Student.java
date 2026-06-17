package com.demo.model;

import java.util.Objects;

public class Student {

    public int sid;
    String name;
    String bdate;
    public String degree;
    double marks;

    public Student(int sid, String name, String bdate,
                   String degree, double marks) {
        this.sid = sid;
        this.name = name;
        this.bdate = bdate;
        this.degree = degree;
        this.marks = marks;
    }

    // needed for Map key
    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.sid == s.sid;
    }

    public int hashCode() {
        return Objects.hash(sid);
    }

    public String toString() {
        return sid + " " + name + " " + degree + " " + marks;
    }
}