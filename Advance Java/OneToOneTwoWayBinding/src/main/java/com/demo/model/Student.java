package com.demo.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="student12")
public class Student {
	@Id
	private int sid;
	private String name;
	private String mobile;
	@OneToOne(fetch=FetchType.LAZY)
	private Address addr;
	public Student() {
		super();
	}
	public Student(int sid, String name, String mobile, Address addr) {
		super();
		this.sid = sid;
		this.name = name;
		this.mobile = mobile;
		this.addr = addr;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", mobile=" + mobile + ", addr=" + addr + "]";
	}
	
	

}
