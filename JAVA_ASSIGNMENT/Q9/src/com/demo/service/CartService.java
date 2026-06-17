package com.demo.service;

import com.demo.model.Product;
import java.util.*;

public interface CartService {
    void showProducts();
    void buyProduct(String user, int choice, int qty);
    void showUsers();
    void deliver(String user);
}