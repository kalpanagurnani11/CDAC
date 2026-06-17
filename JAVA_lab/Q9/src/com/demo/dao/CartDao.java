package com.demo.dao;

import com.demo.model.Product;
import java.util.*;

public interface CartDao {
    List<Product> getProducts();
    void addToCart(String username, Product p);
    Map<String, List<Product>> getCart();
    void removeCart(String username);
}