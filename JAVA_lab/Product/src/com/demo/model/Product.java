package com.demo.model;

public class Product {

    int id;
    String name;
    String type;
    String mfgDate;
    String expDate;
    String category;
    double price;

    public Product(int id, String name, String type, String mfgDate,
                   String expDate, String category, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.mfgDate = mfgDate;
        this.expDate = expDate;
        this.category = category;
        this.price = price;
    }

    public String getType() { return type; }
    public double getPrice() { return price; }

    public String toString() {
        return id + " " + name + " " + type +
               " Price=" + price +
               " Mfg=" + mfgDate +
               " Exp=" + expDate +
               " Cat=" + category;
    }
}