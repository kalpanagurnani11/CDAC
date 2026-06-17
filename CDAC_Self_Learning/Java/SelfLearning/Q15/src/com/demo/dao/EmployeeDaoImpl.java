package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import com.demo.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

    private List<Employee> empList;

    public EmployeeDaoImpl() {
        empList = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee e) {
        empList.add(e);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empList;
    }
}