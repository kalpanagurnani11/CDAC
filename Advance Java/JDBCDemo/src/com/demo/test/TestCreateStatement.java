package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class TestCreateStatement {
	public static void main(String args[])
	{
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		String url="jdbc:mysql://localhost:3306/java?useSSL=false";
		Connection conn=DriverManager.getConnection(url,"root","abc123");
//		if(conn!=null)
//		{
//			System.out.println("connection done");
//		}
//		else
//			System.out.println("not done");
		
		
		
		Statement st=conn.createStatement();
		
		ResultSet rs=st.executeQuery("select * from product");
		
		while(rs.next())
		{
			System.out.println("id:"+rs.getInt(1));
			System.out.println("name:"+rs.getString(2));
			System.out.println("qty:"+rs.getInt(3));
			System.out.println("price:"+rs.getDouble(4));
			java.sql.Date dt=rs.getDate(5);
			LocalDate ldt=dt.toLocalDate();
			System.out.println("MFGDate : "+ldt.toString());
			
			
		}
		
		int pid=11;
		String name="Eraser";
		int qty=30;
		double price=20;
		LocalDate dt=LocalDate.now();
		String query="insert into product values("+pid+",'"+name+"',"+qty+","+price+",'"+dt.toString()+"')";
		int n=st.executeUpdate(query);
		if(n>0)
		{
			System.out.println("done");
		}
		else
		{
			System.out.println("not done");
		}
		conn.close();	
	} 
	
	
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	

}


