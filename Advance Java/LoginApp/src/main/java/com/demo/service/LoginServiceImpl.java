package com.demo.service;

import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;
import com.demo.model.MyUser;

public class LoginServiceImpl implements LoginService {
	LoginDao ldao;
	

	public LoginServiceImpl() {
		
		this.ldao = new LoginDaoImpl();
	}


	@Override
	public MyUser validateUser(String uname, String password) {
		// TODO Auto-generated method stub
		return ldao.authenticateUser(uname,password);
	}

}
