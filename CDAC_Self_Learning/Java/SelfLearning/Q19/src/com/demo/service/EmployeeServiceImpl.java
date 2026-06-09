package com.demo.service;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao dao = new EmployeeDaoImpl();

  
    @Override
    public List<String> getAllNames() {
        return dao.getAllEmployees().stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

   
    @Override
    public double getTotalSalary() {
        return dao.getAllEmployees().stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
    }

  
    @Override
    public long countEmployees() {
        return dao.getAllEmployees().stream().count();
    }

    @Override
    public List<Employee> sortBySalary() {
        return dao.getAllEmployees().stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
    }


    @Override
    public List<Employee> filterSalary() {
        return dao.getAllEmployees().stream()
                .filter(emp -> emp.getSalary() > 30000)
                .collect(Collectors.toList());
    }
}