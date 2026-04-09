package com.demo.model;

public class CompanyCustomer extends Customer {

    private String relationshipManager;
    private double creditLine;
    private int extensions;
    private String[] numbers;

    public CompanyCustomer(int custId, String name, String email,
                           String creditClass, double discount, String plan,
                           String relationshipManager, double creditLine,
                           int extensions, String[] numbers) {

        super(custId, name, email, creditClass, discount, plan);
        this.relationshipManager = relationshipManager;
        this.creditLine = creditLine;
        this.extensions = extensions;
        this.numbers = numbers;
    }

    public String toString() {
        String nums = "";
        for(String n : numbers) {
            nums += n + " ";
        }

        return "Company Customer -> ID=" + custId +
               ", Name=" + name +
               ", RM=" + relationshipManager +
               ", CreditLine=" + creditLine +
               ", Extensions=" + extensions +
               ", Numbers=" + nums;
    }
}