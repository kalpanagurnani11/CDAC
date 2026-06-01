package com.demo.model;



import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="personCrud")
public class Person {
	@Id
	private int pid;
	private String pname;
	private String mob;
	@ManyToMany(mappedBy="per")
	private Set <Address> addrset;
	public Person() {
		super();
	}
	public Person(int pid, String pname, String mob, Set<Address> addr) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mob = mob;
		this.addrset = addr;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public Set<Address> getAddr() {
		return addrset;
	}
	public void setAddr(Set<Address> addr) {
		this.addrset = addr;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mob=" + mob + ", addr=" + addrset + "]";
	}
	
	

}
