package com.demo.service;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;

import java.util.HashSet;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao dao = new EmployeeDaoImpl();

    @Override
    public void addEmployee(Employee e) {
        dao.addEmployee(e);
    }

    @Override
    public HashSet<Employee> getEmployees() {
        return dao.getAllEmployees();
    }
}