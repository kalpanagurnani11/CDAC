package com.demo.dao;

import com.demo.model.Person;

public interface PersonDao {

	boolean savePerson(Person p);

	Person findPerson(int pid);

	boolean updatePerson(int pid);

}
