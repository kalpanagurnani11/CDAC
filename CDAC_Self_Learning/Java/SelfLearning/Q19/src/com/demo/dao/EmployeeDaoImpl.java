package com.demo.dao;

import com.demo.model.Employee;
import java.util.Arrays;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public List<Employee> getAllEmployees() {
        return Arrays.asList(
                new Employee(1, "Manvendra", 50000),
                new Employee(2, "Amit", 25000),
                new Employee(3, "Rahul", 40000),
                new Employee(4, "Neha", 30000)
        );
    }
}