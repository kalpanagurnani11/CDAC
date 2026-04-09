package com.demo.dao;

import java.util.List;
import com.demo.model.Product;

public interface ProductDao {

    void addProduct(Product p);

    List<Product> getAllProducts();

    double calculateTax(Product p);
}