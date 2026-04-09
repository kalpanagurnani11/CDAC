		package com.demo.model;

import java.util.Objects;

public class Person implements Comparable <Person>{
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
public Person(int id) {
	this.id=id;
}	


//@Override
//public int hashCode() {
//	return Objects.hash(id);
//}
//

@Override
public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
	Person other = (Person) obj;
	System.out.println("in persons equals method  "+this.id+"--------"+other.id);
	return id == other.id;
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


@Override
public int compareTo(Person o) {
	if(this.id<o.id)
	{
	return -1;
	}
	else if(this.id==o.id)
	{
		return 0;
	}
	else
	return 1;
}

}
