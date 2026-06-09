package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyUser;

@Repository
public class LoginDaoImpl implements LoginDao {
     
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public MyUser authenticateUser(String u1, String pass) {
		System.out.println("authenticateUser");
		MyUser user1=jdbcTemplate.queryForObject("select username,role from myuser where username=? and password=?", new Object[] {u1,pass},
				(rs,num)->{
					MyUser u=new MyUser();
					u.setUname(rs.getString(1));
					u.setRole(rs.getString(2));
					return u;
				});
		System.out.println(user1);
		return user1;
	}
	
	
}
