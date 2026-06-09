package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> findAllProduct();

	boolean addprod(Product p);

	Product findById(int pid);

	boolean updateById(Product product);

	boolean removeById(int pid);

}
