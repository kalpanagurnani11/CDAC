package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.demo.comparators.EmployeeNameComparator;
import com.demo.comparators.EmployeeSalComparator;
import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;
import com.demo.model.Vendor;

public class EmployeeDaoImpl implements EmployeeDao{
		static List<Employee>elist;
		static {
			elist=new ArrayList<>();
			elist.add(new SalariedEmp(12,"abcd","2222","Hr","mgr",45678));
			elist.add(new ContractEmp(13,"pqrs","4444","admin","intern",45,8789));
			
		}
		@Override
		public boolean save(Employee e) {
			 return elist.add(e);
		}
		@Override
		public List<Employee> findAll() {
			return elist;
		}
		@Override
		public Employee findById(int id) {
			int pos=elist.indexOf(new SalariedEmp(id));
			if(pos!=-1)
			{
				return elist.get(pos);
			}
			return null;
		}
		@Override
		public boolean deleteById(int id) {
			return elist.remove(new SalariedEmp(id));
		}
		@Override
		public List<Employee> sortByName() {
			List<Employee> elst=new ArrayList<>();
			for(Employee e:elist)
			{
				elst.add(e);
			}
			elst.sort(new EmployeeNameComparator());
			return elst;
		}
		@Override
		public List<Employee> getByName(String nm) {
			List<Employee> lst=elist.stream()
					 .filter(e->e.getName().equals(nm))
					 .collect(Collectors.toList());
			 if(lst.size()>0) {
				 return lst;
			 }else {
				 return null;
			 
		}
		}
		@Override
		public double calculateSal(int id) {
			Employee e=findById(id);
			if(e!=null)
			{
				return e.calculatesal();
			}
			else {
				return 0;
			}
		}
		@Override
		public double calculateBonus(int id) {
//			Employee e=findById(id);
//			if(e!=null)
//			{
//				if(e instanceof SalariedEmp)
//				{
//					((SalariedEmp) e).calculatebonus();
//				}
//			else {
//				return (Double) null;
//			}

			return 0;
		}
		@Override
		public boolean modifyById(int id, double sal) {
			Employee e=findById(id);
			if(e!=null)
			{
				if(e instanceof SalariedEmp)
				{
					((SalariedEmp) e).setSal(sal);
				}
				else if(e instanceof ContractEmp)
				{
					((ContractEmp)e).setCharges(sal);
				}
				else if(e instanceof Vendor)
				{
					((Vendor)e).setChargeperemp(sal);
			}
			}
			return false;
		}
		@Override
		public List<Employee> sortBySal() {
			List<Employee> elst=new ArrayList<>();
			for(Employee e:elist)
			{
				elst.add(e);
			}
			elst.sort(new EmployeeSalComparator());
			return elst;
		}
			
					
		@Override
		public List<Employee> sortById() {
			List<Employee> elst=new ArrayList<>();
			for(Employee e:elist)
			{
				elst.add(e);
			}
			elst.sort(null);
			return elst;

	}
}
//		@Override
//		public double calculateSal(int id) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//		@Override
//		public double calculateBonus(int id) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//		@Override
//		public boolean modifyById(int id, double sal) {
//			// TODO Auto-generated method stub
//			return false;
//		}
//		@Override
//		public List<Employee> sortBySal() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//	}
//
//
