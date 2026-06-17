package com.demo;

class Car extends Vehicle {
    private String model;

    Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    void start() {
        System.out.println(model + " starting");
    }
}

