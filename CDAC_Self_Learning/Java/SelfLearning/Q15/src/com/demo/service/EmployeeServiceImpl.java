package com.demo.service;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;
import com.demo.comparator.NameComparator;
import com.demo.comparator.IdComparator;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao dao;

    public EmployeeServiceImpl() {
        dao = new EmployeeDaoImpl();
    }

    @Override
    public void addEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID:");
        int id = sc.nextInt();

        System.out.println("Enter Name:");
        String name = sc.next();

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();

        dao.addEmployee(new Employee(id, name, salary));
    }

    @Override
    public void displayEmployees() {
        List<Employee> list = dao.getAllEmployees();
        list.forEach(System.out::println);
    }

    @Override
    public void sortBySalary() {
        Collections.sort(dao.getAllEmployees()); // Comparable
        System.out.println("Sorted by Salary");
    }

    @Override
    public void sortByName() {
        Collections.sort(dao.getAllEmployees(), new NameComparator());
        System.out.println("Sorted by Name");
    }

    @Override
    public void sortById() {
        Collections.sort(dao.getAllEmployees(), new IdComparator());
        System.out.println("Sorted by ID");
    }
}