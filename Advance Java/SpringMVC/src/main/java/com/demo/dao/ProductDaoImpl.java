package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
private JdbcTemplate jdbcTemplate;

	@Override
	public List<Product> findAllProduct() {
		List<Product> plist=jdbcTemplate.query("select * from product", (rs,num)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			p.setMfgdate(rs.getDate(5).toLocalDate());
			p.setCid(rs.getInt(6));
			return p;
		});
		return plist;
	}

	@Override
	public boolean addprod(Product p) {
		// TODO Auto-generated method stub
		String sql="insert into product values (?,?,?,?,?,?)";
		int r=jdbcTemplate.update(sql,p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getMfgdate(),p.getCid());
		return r>0;
			
		
		
	}

	@Override
	public Product findById(int pid) {
		Product p1=jdbcTemplate.queryForObject("select * from product where pid=?", new Object[] {pid},(rs,num)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			p.setMfgdate(rs.getDate(5).toLocalDate());
			p.setCid(rs.getInt(6));
			return p;
		});
		return p1;
	}

	@Override
	public boolean updateById(Product p) {
		int n=jdbcTemplate.update("update product set qty=?,price=?,pname=? where pid=?",new Object[] {p.getQty(),p.getPrice(),p.getPname(),p.getPid()});
	   return n>0;
	}

	@Override
	public boolean removeById(int pid) {
		int n=jdbcTemplate.update("delete from product where pid=?",new Object[] {pid});
		return n>0;
	}
}

