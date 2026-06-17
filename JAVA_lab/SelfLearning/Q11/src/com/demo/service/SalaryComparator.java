package com.demo.service;

import com.demo.model.Employee;
import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.salary - e2.salary;
    }
}