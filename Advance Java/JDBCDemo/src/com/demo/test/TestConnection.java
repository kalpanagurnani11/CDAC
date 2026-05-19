package com.demo.test;
import java.sql.*;

public class TestConnection {
	public static void main(String args[]) 
	{
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			String url="jdbc:mysql://localhost:3306/new?useSSL=false";
			Connection conn=DriverManager.getConnection(url,"root","abc123");
			if(conn!=null)
			{
				System.out.println("connection done");
			}
			else
				System.out.println("not done");
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
