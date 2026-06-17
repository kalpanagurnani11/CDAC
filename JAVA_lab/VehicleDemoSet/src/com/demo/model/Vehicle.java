package com.demo.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Vehicle implements Comparable<Vehicle>,Serializable {
	private int vid;
	private String vname;
	private double price;
	private String model;
	private LocalDate mfgdate;
	public Vehicle() {
		super();
	}
	public Vehicle(int vid, String vname, double price, String model, LocalDate mfgdate) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.price = price;
		this.model = model;
		this.mfgdate = mfgdate;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public LocalDate getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(LocalDate mfgdate) {
		this.mfgdate = mfgdate;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + ", price=" + price + ", model=" + model + ", mfgdate="
				+ mfgdate + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("in vehicle hashCodeMethod "+this.vid);
		return vid;
	}
	@Override
	public boolean equals(Object obj) {
		
		Vehicle other = (Vehicle) obj;
		return this.vid==other.vid;
	}
	@Override
	public int compareTo(Vehicle o) {
		System.out.println("in compareTo method "+this.vid+"------>"+o.vid);
		return this.vid-o.vid;
	}
	
	
	
	
	

}
