package com.demo.service;

import com.demo.model.Employee;
import java.util.List;

public interface EmployeeService {

    List<String> getAllNames();       // map
    double getTotalSalary();          // reduce
    long countEmployees();            // count
    List<Employee> sortBySalary();    // sort
    List<Employee> filterSalary();    // filter
}