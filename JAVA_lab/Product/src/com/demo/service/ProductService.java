package com.demo.service;

import java.util.List;
import com.demo.model.Product;

public interface ProductService {

    void addProduct(Product p);

    List<Product> getAllProducts();

    double calculateTax(Product p);
}