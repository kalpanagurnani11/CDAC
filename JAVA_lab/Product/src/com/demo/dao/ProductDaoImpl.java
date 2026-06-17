package com.demo.dao;

import java.util.*;
import com.demo.model.Product;

public class ProductDaoImpl implements ProductDao {

    List<Product> plist = new ArrayList<>();

    public void addProduct(Product p) {
        plist.add(p);
    }

    public List<Product> getAllProducts() {
        return plist;
    }

    public double calculateTax(Product p) {

        if (p.getType().equalsIgnoreCase("perishable")) {
            return p.getPrice() * 0.05;
        } else {
            return (p.getPrice() * 0.15) + 100;
        }
    }
}