package com.demo.service;

import com.demo.model.Employee;
import java.util.HashSet;

public interface EmployeeService {
    void addEmployee(Employee e);
    HashSet<Employee> getEmployees();
}