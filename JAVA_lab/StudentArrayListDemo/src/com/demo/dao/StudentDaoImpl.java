package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Student;

public class StudentDaoImpl implements StudentDao {
	static List<Student> slist;
	static {
		slist=new ArrayList<>();
		slist.add(new Student(12,"abc",LocalDate.of(2020, 12,11),78,89,67));
		slist.add(new Student(13,"pqr",LocalDate.of(2022, 02,13),78,89,67));
		slist.add(new Student(14,"abc",LocalDate.of(2021, 10,15),78,89,67));
		
		
	}
	@Override
	public boolean save(Student student) {
		return slist.add(student);
	}
	@Override
	public List<Student> getAll() {
		return slist;
	}
	@Override
	public boolean removeById(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Student findById(int id) {
		for(Student s:slist)
		{
			if(s.getSid()==id)
			{
				return s;
			}
		}
		return null;
	}
	@Override
	public List<Student> findByName(String nm) {
		List<Student> ns=new ArrayList<>();
		for(Student s:slist)
		{
			if(s.getName().equals(nm))
			{
				ns.add(s);
			}
		
		}
		return ns;
	}
	@Override
	public List<Student> sortById() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> sortByName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> sortByMarks() {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
