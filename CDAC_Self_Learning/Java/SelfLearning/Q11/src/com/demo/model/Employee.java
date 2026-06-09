package com.demo.model;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    public int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Employee e) {
        return this.id - e.id;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}