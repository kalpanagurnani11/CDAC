package com.demo.test;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployee {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeServiceImpl();

        Employee e1 = new Employee(101, "Manvendra", 50000);
        Employee e2 = new Employee(102, "Rahul", 60000);
        Employee e3 = new Employee(101, "Amit", 70000); // duplicate

        service.addEmployee(e1);
        service.addEmployee(e2);
        service.addEmployee(e3);

        System.out.println("\nEmployees List:");
        service.getEmployees().forEach(System.out::println);
    }
}