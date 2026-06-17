package com.demo.dao;

import com.demo.model.Product;
import java.util.*;

public class CartDaoImpl implements CartDao {

    private static List<Product> products = new ArrayList<>();
    private static Map<String, List<Product>> cart = new HashMap<>();

    static {
        products.add(new Product(1, "Shoes", 3000, 10));
        products.add(new Product(2, "Shirt", 1500, 20));
        products.add(new Product(3, "Bag", 2000, 15));
        products.add(new Product(4, "Watch", 5000, 5));
        products.add(new Product(5, "Laptop Bag", 1200, 12));
        products.add(new Product(6, "Jeans", 2500, 10));
        products.add(new Product(7, "T-shirt", 800, 25));
        products.add(new Product(8, "Perfume", 1800, 18));
        products.add(new Product(9, "Cap", 500, 30));
        products.add(new Product(10, "Wallet", 1000, 22));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addToCart(String username, Product p) {
        cart.putIfAbsent(username, new ArrayList<>());
        cart.get(username).add(p);
    }

    public Map<String, List<Product>> getCart() {
        return cart;
    }

    public void removeCart(String username) {
        cart.remove(username);
    }
}