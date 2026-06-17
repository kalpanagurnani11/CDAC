package com.demo.dao;

import com.demo.model.Employee;
import java.util.HashSet;

public class EmployeeDaoImpl implements EmployeeDao {

    private HashSet<Employee> empSet = new HashSet<>();

    @Override
    public void addEmployee(Employee e) {
        boolean added = empSet.add(e);

        if (added)
            System.out.println("Employee added");
        else
            System.out.println("Duplicate employee (not added)");
    }

    @Override
    public HashSet<Employee> getAllEmployees() {
        return empSet;
    }
}