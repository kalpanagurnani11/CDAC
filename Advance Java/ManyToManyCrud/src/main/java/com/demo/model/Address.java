
	
	package com.demo.model;

	import java.util.Set;

	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


	@Entity
	@Table(name="addressCrud")
	public class Address {
		public Address(int aid, String street, String city, String state) {
			super();
			this.aid = aid;
			this.street = street;
			this.city = city;
			this.state = state;
		}


		@Id
		private int aid;
		private String street;
		private String city;
		private String state;
		@ManyToMany 
		private Set<Person> per;
		
		
		public Set<Person> getPer() {
			return per;
		}


		public void setPer(Set<Person> per) {
			this.per = per;
		}


		public Address(int aid, String street, String city, String state, Set<Person> p) {
			super();
			this.aid = aid;
			this.street = street;
			this.city = city;
			this.state = state;
			this.per= p;
		}


		public Address() {
			super();
		}


		

		public Set<Person> getP() {
			return per;
		}


		public void setP(Set<Person> p) {
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
			return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", state=" + state + 
				"]";
		}
		

	}



