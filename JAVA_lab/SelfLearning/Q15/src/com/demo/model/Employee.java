package com.demo.model;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;

    public Employee() {}

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    // Comparable → default sort by salary
    @Override
    public int compareTo(Employee e) {
        return Double.compare(this.salary, e.salary);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

	
	}
