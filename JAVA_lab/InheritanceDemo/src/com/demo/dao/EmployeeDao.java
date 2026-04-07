package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDao {
	List<Employee> sortByName();
	boolean save(Employee e);
	List<Employee> findAll();
	Employee findById(int id);
	boolean deleteById(int id);
	List<Employee> getByName(String nm);
	double calculateSal(int id);
	double calculateBonus(int id);
	boolean modifyById(int id, double sal);
	List<Employee> sortBySal();
	List<Employee> sortById();

}
