package com.demo.model;

public class Vendor extends Person {

    private int vendorId;
    private String phone;
    private String[] products;

    public Vendor(int vendorId, String name, String email,String phone, String[] products) {
        super(name, email);
        this.vendorId = vendorId;
        this.phone = phone;
        this.products = products;
    }

    public String toString() {
        String p = "";
        for(String pr : products) {
            p += pr + " ";
        }

        return "VendorID=" + vendorId +
               ", Name=" + name +
               ", Email=" + email +
               ", Phone=" + phone +
               ", Products=" + p;
    }
}