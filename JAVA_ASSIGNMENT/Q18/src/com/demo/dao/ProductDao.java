package com.demo.dao;


import com.demo.model.Product;

public interface ProductDao {

    void addProduct(Product p);

    void deleteProduct(int id);

    void updateProduct(Product p);

    void displayAll();

    void displayById(int id);

    void displayQtyGreaterThan(int qty);
}