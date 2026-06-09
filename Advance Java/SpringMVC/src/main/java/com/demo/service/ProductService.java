package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

import jakarta.validation.Valid;

public interface ProductService {

	List<Product> getAllProduct();

	boolean addProduct(Product p);

	Product getProductById(int pid);

	boolean modifyProductById(@Valid Product product);

	boolean deleteById(int pid);

}
