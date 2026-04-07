package com.demo.comparators;

import java.util.Comparator;

import com.demo.model.Person;

public class EmployeeNameComparator implements Comparator <Person>
{

	@Override
	
	public int compare(Person o1, Person o2) {
		System.out.println("in compare method "+o1.getName()+"--------->>>>"+o2.getName());
		return o1.getName().compareTo(o2.getName());
	}
	

}
