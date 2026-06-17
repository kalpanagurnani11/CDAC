package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn;
	
	public static Connection getMyConnection()
	{
		String url;
		if(conn==null)
		{
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				url="jdbc:mysql://localhost:3306/java?useSSL=false&allowPublicKeyRetrieval=true";
				conn=DriverManager.getConnection(url,"root","abc123");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return conn;
	}
	
	
	

}
