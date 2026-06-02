package com.demo.dao;


import java.sql.*;

public class DBUtil {

    private static final String URL =
            "jdbc:mysql://localhost:3306/cdac";

    private static final String USER = "root";
    private static final String PASSWORD = "abc123";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}