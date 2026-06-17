package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Category;

public class CategoryDaoImpl implements CategoryDao{
	static Connection conn;
	static
	{
		conn=DBUtil.getMyConnection();
	}
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst=conn.prepareStatement("select * from category");
			ResultSet rs=pst.executeQuery();
			List<Category> clist=new ArrayList<>();
			while(rs.next())
			{
			Category c=new Category(rs.getInt(1),rs.getString(2),rs.getString(3));
			clist.add(c);
			}return clist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
