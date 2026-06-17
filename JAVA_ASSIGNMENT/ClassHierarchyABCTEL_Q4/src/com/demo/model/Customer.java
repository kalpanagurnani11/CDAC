package com.demo.model;

public class Customer extends Person {

    protected int custId;
    protected String creditClass;
    protected double discount;
    protected String plan;

    public Customer(int custId, String name, String email,
                    String creditClass, double discount, String plan) {
        super(name, email);
        this.custId = custId;
        this.creditClass = creditClass;
        this.discount = discount;
        this.plan = plan;
    }
}