package com.demo.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private int qty;
    private double price;

    public Product(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getQty() { return qty; }
    public double getPrice() { return price; }
}