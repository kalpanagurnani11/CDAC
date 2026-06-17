package com.demo.comparators;

import java.util.Comparator;

import com.demo.model.ContractEmp;
import com.demo.model.Person;
import com.demo.model.SalariedEmp;
import com.demo.model.Vendor;

public class EmployeeSalComparator implements Comparator <Person> {

	@Override
	public int compare(Person o1, Person o2) {
		double s1=0.0,s2=0.0;
		if(o1 instanceof SalariedEmp)
		{
			s1=((SalariedEmp)o1).getSal();
			
		}
		else if(o1 instanceof ContractEmp)
		{
			s1=((ContractEmp)o1).getCharges();
			
		}
		if(o1 instanceof Vendor)
		{
			s1=((Vendor)o1).getChargeperemp();
			
		}
		return 0;
	}
	

}
