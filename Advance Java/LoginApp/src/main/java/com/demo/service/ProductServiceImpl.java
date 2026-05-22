package com.demo.service;

import java.util.List;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.model.Product;



public class ProductServiceImpl implements ProductService {
	ProductDao pdao;

	public ProductServiceImpl() {
		super();
		this.pdao =new ProductDaoImpl();
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return pdao.findAll();
	}

	@Override
	public boolean addProduct(Product p) {
		// TODO Auto-generated method stub
		return pdao.insertProduct(p);
	}

}
