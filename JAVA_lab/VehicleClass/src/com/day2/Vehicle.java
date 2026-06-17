package com.day2;

public class Vehicle {
	private String vid;
	private String vcity;
	private String vstate;
	private static int  count;
	static {
		count=100;
	}
	public String genrateVid(String city,String state)
	{
		count++;
		return state.substring(0,3).toUpperCase()+city.substring(0,3).toUpperCase()+count;
	}

	
	public Vehicle()
	{
		System.out.println("in default");
		vid=genrateVid("Maharashtra","Mumbai");
		vcity=null;
		vstate=null;
		
	}
	public Vehicle(String city,String state)
	{
		System.out.println("in para");
//		count++;
		vid=genrateVid( state, city);
		vcity=city;
		vstate=state;
	}
	public void setVcity(String s)
	{
		vcity=s;
	}
	public String getVcity()
	{
		return vcity;
	}
	public void setState(String s)
	{
		vstate=s;
	}
	public String getVstate()
	{
		return vstate;
	}
	public String toString()
	{
		return " vid:"+vid+" vstate:"+vstate+" vcity:"+vcity;
		}

}


