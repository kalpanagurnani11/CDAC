package com.demo.model;

import java.util.Objects;

public class Employee {

    private int id;
    private String name, dept, designation;
    private double sal;

    public Employee(int id, String name, double sal, String dept, String designation) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    // IMPORTANT → for HashSet (no duplicate based on id)
    @Override
    public boolean equals(Object o) {
        Employee e = (Employee) o;
        return this.id == e.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + " " + name + " " + sal + " " + dept + " " + designation;
    }
}