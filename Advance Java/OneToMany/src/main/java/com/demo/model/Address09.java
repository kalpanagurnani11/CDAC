package com.demo.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Address09 {
	@Id
	private int aid;
	private String street;
	private String city;
	private String state;
	@ManyToOne 
	private Person per;
	
	
	public Address09(int aid, String street, String city, String state, Person p) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.per= p;
	}


	public Address09() {
		super();
	}


	

	public Person getP() {
		return per;
	}


	public void setP(Person p) {
		this.per = p;
	}


	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	

}
