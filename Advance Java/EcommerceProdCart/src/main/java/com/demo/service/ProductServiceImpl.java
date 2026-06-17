package com.demo.service;

import java.util.List;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.model.Product;

public class ProductServiceImpl implements ProductService {
	
	ProductDao pdao;

	public ProductServiceImpl() {
		
		this.pdao = new ProductDaoImpl();
	}

	

	@Override
	public List<Product> getAllProduct(int catid) {
		// TODO Auto-generated method stub
	return pdao.findAllProd(catid);
	}




}
