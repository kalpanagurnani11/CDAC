package com.demo.dao;

public interface LoginDao {

	String authenticateUser(String uname, String passwd);

	void closeMyConnection();

}
