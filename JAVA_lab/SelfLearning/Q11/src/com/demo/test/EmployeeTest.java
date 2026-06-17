package com.demo.test;

import com.demo.model.Employee;
import com.demo.service.SalaryComparator;

import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(3, "A", 30000));
        list.add(new Employee(1, "B", 50000));
        list.add(new Employee(2, "C", 20000));

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, new SalaryComparator());

        System.out.println(list);
    }
}