package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	boolean addNewProduct();

	List<Product> getAll();

	List<Product> getAllSortedByName();

	Product getById(int id);

	boolean modifyById(int pid, int qty, double pr);

	boolean deleteById(int pid);

}
