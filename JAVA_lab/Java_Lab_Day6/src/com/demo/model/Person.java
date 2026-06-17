package com.demo.model;

public class Person {
private int id;
private String name;
private String mob;

public Person() {
	super();
	System.out.println("in Person default constructor");

}


public Person(int id, String name, String mob) {
	super();
	System.out.println("in Person para constructor");

	this.id = id;
	this.name = name;
	this.mob = mob;
}


public void setId(int id) {
	this.id = id;
}


public void setName(String name) {
	this.name = name;
}


public void setMob(String mob) {
	this.mob = mob;
}


public int getId() {
	return id;
}


public String getName() {
	return name;
}


public String getMob() {
	return mob;
}



public String toString() {
	return "Person [id=" + id + ", name=" + name + ", mob=" + mob + "]";
}

}
