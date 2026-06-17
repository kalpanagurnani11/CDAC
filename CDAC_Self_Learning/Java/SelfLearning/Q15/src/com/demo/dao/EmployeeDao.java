package com.demo.dao;

import java.util.List;
import com.demo.model.Employee;

public interface EmployeeDao {
    void addEmployee(Employee e);
    List<Employee> getAllEmployees();
}