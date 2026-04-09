package com.demo.model;

public class IndividualCustomer extends Customer {

    private String phone;

    public IndividualCustomer(int custId, String name, String email,
                              String creditClass, double discount,
                              String plan, String phone) {
        super(custId, name, email, creditClass, discount, plan);
        this.phone = phone;
    }

    public String toString() {
        return "Individual Customer -> ID=" + custId +
               ", Name=" + name +
               ", Phone=" + phone +
               ", Plan=" + plan;
    }
}