package com.demo.dao;

import com.demo.model.Employee;
import java.util.HashSet;

public interface EmployeeDao {
    void addEmployee(Employee e);
    HashSet<Employee> getAllEmployees();
}