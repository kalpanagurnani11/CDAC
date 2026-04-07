
package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;
import com.demo.model.ContractEmp;
import com.demo.model.Vendor;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao edao;
	public EmployeeServiceImpl()
	{
		this.edao=new EmployeeDaoImpl();
	}

	@Override
	public boolean addNewEmployee(int ch) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter mob");
		String mob=sc.next();
		System.out.println("enter dept");
		String dept=sc.next();
		System.out.println("enter desg");
		String desg=sc.next();
		Employee e=null;
		if(ch==1)
		{
			System.out.println("enter salary");
			double s=sc.nextDouble();
			e=new SalariedEmp(id,nm,mob,dept,desg,s);
//			edao.save(e);
			
		}
		
		
		else if(ch==2) {
			System.out.println("enter hrs");
			float hrs=sc.nextFloat();
			System.out.println("enter charges");
			double c=sc.nextDouble();
			 e=new ContractEmp(id,nm,mob,dept,desg,hrs,c);
			
		}else if(ch==3) {
			System.out.println("enter no.of person");
			int numofemp=sc.nextInt();
			System.out.println("enter chargesperprson");
			double chargeperemp=sc.nextDouble();
			 e=new Vendor(id,nm,mob,dept,desg,numofemp,chargeperemp);
		}
		return edao.save(e);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return edao.findAll();
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return edao.findById(id);
	}

	@Override
	public boolean deleteById(int id) {
		return edao.deleteById(id);
	}

	@Override
	public List<Employee> getByName(String nm) {
		// TODO Auto-generated method stub
		return edao.getByName(nm);
	}

	@Override
	public boolean modifyById(int id, double sal) {
		// TODO Auto-generated method stub
		return edao.modifyById(id,sal);
	}

	@Override
	public List<Employee> sortById() {
		// TODO Auto-generated method stub
		return edao.sortById();
	}

	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		return edao.sortByName();
	}

	@Override
	public List<Employee> sortBySal() {
		// TODO Auto-generated method stub
		return edao.sortBySal();
	}

	@Override
	public double calculateSal(int id) {
		// TODO Auto-generated method stub
		return edao.calculateSal(id);
	}

	@Override
	public double calculateBonus(int id) {
		// TODO Auto-generated method stub
		return edao.calculateBonus(id);
	}

}
