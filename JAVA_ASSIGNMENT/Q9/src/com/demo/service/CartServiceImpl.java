package com.demo.service;

import com.demo.dao.*;
import com.demo.model.Product;
import java.util.*;

public class CartServiceImpl implements CartService {

    private CartDao dao = new CartDaoImpl();

    @Override
    public void showProducts() {
        List<Product> list = dao.getProducts();
        int i = 1;
        for (Product p : list) {
            System.out.println(i++ + ". " + p.getName() + " - " + p.getPrice());
        }
    }

    @Override
    public void buyProduct(String user, int choice, int qty) {
        Product p = dao.getProducts().get(choice - 1);

        Product cartItem = new Product(p.getId(), p.getName(), p.getPrice(), qty);
        dao.addToCart(user, cartItem);

        double amount = p.getPrice() * qty;
        System.out.println("Amount: " + amount);
    }

    @Override
    public void showUsers() {
        System.out.println("Users: " + dao.getCart().keySet());
    }

    @Override
    public void deliver(String user) {
        Map<String, List<Product>> cart = dao.getCart();

        if (!cart.containsKey(user)) {
            System.out.println("No cart found!");
            return;
        }

        double total = 0;

        for (Product p : cart.get(user)) {
            total += p.getPrice() * p.getQty();
        }

        System.out.println("Bill: " + total);

        Scanner sc = new Scanner(System.in);
        System.out.print("Deliver (y/n): ");
        String ch = sc.next();

        if (ch.equalsIgnoreCase("y")) {
            System.out.println("Order Delivered!");
            dao.removeCart(user);
        }
    }
}