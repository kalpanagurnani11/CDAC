package com.demo.service;
import java.util.List;


import com.demo.model.Employee;

public interface EmployeeService {
	boolean addNewEmployee(int  ch);
	List<Employee>getAll();
	Employee getById(int id);
	boolean deleteById(int id);
	List<Employee> getByName(String nm);
	boolean modifyById(int id, double sal);
	List<Employee> sortById();
	List<Employee> sortByName();
	List<Employee> sortBySal();
	double calculateSal(int id);
	double calculateBonus(int id);
	

	

}
