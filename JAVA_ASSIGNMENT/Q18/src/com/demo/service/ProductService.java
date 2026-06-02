package com.demo.service;


import com.demo.model.Product;

public interface ProductService {

    void addProduct(Product p);

    void deleteProduct(int id);

    void updateProduct(Product p);

    void displayAll();

    void displayById(int id);

    void displayQtyGreaterThan(int qty);
}