package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

import jakarta.validation.Valid;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
   private ProductDao pdao;

	@Override
	public List<Product> getAllProduct() {
		return pdao.findAllProduct();
	}

	@Override
	public boolean addProduct(Product p) {
		// TODO Auto-generated method stub
		return pdao.addprod(p);
	}


	@Override
	public Product getProductById(int pid) {
		return pdao.findById(pid);
	}

	@Override
	public boolean modifyProductById(Product product) {
		return pdao.updateById(product);
	}

	@Override
	public boolean deleteById(int pid) {
		return pdao.removeById(pid);
	}
}
