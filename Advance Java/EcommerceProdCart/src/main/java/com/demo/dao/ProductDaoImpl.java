package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Product;

public class ProductDaoImpl implements ProductDao {
	static Connection conn;
	static
	{
		conn=DBUtil.getMyConnection();
	}
	

	@Override
	public List<Product> findAllProd(int catid) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();
		try {
			PreparedStatement pst=conn.prepareStatement("select * from product where cid=?");
			pst.setInt(1, catid);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				
				 java.sql.Date sqlDate = rs.getDate(5);

		            Product p = new Product(
		                rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),(sqlDate != null ? sqlDate.toLocalDate() : null),
		                rs.getInt(6)
		            );
				 list.add(p);
				
				}
			return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
