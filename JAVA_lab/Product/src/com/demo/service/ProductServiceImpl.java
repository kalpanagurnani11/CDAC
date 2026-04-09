package com.demo.service;

import java.util.List;
import com.demo.dao.*;
import com.demo.model.Product;

public class ProductServiceImpl implements ProductService {

    ProductDao dao = new ProductDaoImpl();

    public void addProduct(Product p) {
        dao.addProduct(p);
    }

    public List<Product> getAllProducts() {
        return dao.getAllProducts();
    }

    public double calculateTax(Product p) {
        return dao.calculateTax(p);
    }
}