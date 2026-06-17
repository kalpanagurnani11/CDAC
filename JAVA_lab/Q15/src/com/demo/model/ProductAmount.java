package com.demo.model;

import java.io.Serializable;

public class ProductAmount implements Serializable {
    private int id;
    private String name;
    private int qty;
    private double price;
    private double amount;

    public ProductAmount(int id, String name, int qty, double price, double amount) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return id + ":" + name + ":" + qty + ":" + price + ":" + amount;
    }
}