package com.day2;

public class Person {
	private String pid;
	private String pname;
	private String mob;
	private static int  count;
	static {
		count=0;
	}
	public String genratePid(String s,String m)
	{
		count++;
		return s.substring(0,3)+m.substring(0,3)+count;
	}

	
	public Person()
	{
		System.out.println("in default");
		pid=genratePid("abc","xxxxx");
		pname=null;
		mob=null;
	}
	public Person(String s,String m)
	{
		System.out.println("in para");
//		count++;
		pid=genratePid( s, m);
		pname=s;
		mob=m;
	}
	public void setPname(String s)
	{
		pname=s;
	}
	public String getPname()
	{
		return pname;
	}
	public void setMob(String s)
	{
		mob=s;
	}
	public String getMob()
	{
		return mob;
	}
	public String toString()
	{
		return " pid:"+pid+" pname:"+pname+" mob:"+mob;
		}

}
