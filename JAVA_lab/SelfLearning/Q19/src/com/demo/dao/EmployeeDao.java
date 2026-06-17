package com.demo.dao;

import com.demo.model.Employee;
import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployees();
}