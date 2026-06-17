package com.day2;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

		private int sid;
		private String sname;
		private float m1;
		private float m2;
		private float m3;
		private Date jdate;
		
		
		public Student()
		{
			System.out.println("in default");
			sid=0;
			sname=null;
			this.m1=0f;
			this.m2=0f;
			this.m3=0f;
			jdate=null;
		}
		
		public Student(int id,String nm,float m1,float m2,float m3,Date jd)
		{
			System.out.println("in para");
			sid=id;
			sname=nm;
			this.m1=m1;
			this.m2=m2;
			this.m3=m3;
			jdate=jd;
		}
		public  void setSid(int s)
		{
			sid=s;
		}
		public int getSid() {
			return sid;
			
		}
		public  void setSname(String s)
		{
			sname=s;
		}
		public String getSname() {
			return sname;
			
		}
		public  void setM1(float s)
		{
			m1=s;
		}
		public float getM1() {
			return m1;
			
		}
		public  void setM2(float s)
		{
			m2=s;
		}
		public float getM2() {
			return m2;
			
		}
		public  void setM3(float s)
		{
			m3=s;
		}
		public float getM3() {
			return m3;
			
		}
		public  void setDate(Date s)
		{
			jdate=s;
		}
		public Date getDate() {
			return jdate;
			
		}
		public String toString()
		{
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYY");
			String str=sdf.format(jdate);
			return "id:"+sid+" ,"+"name:"+sname+" ,"+"m1:"+m1+", "+"m2:"+m2+", "+"m3:"+m3+" ,"+"date:"+str;
			
		}

}
