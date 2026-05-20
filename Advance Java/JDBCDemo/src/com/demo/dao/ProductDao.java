package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {

	boolean saveProduct(Product p);

	List<Product> findAll();

	Product findById(int id);

	List<Product> findAllSortedByName();

	boolean removeById(int pid);

	boolean updateById(int pid, int qty, double pr);

}
