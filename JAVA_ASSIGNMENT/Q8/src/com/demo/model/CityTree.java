package com.demo.model;

import java.util.List;

public class CityTree {
    private String city;
    private List<String> trees;

    public CityTree(String city, List<String> trees) {
        this.city = city;
        this.trees = trees;
    }

    public String getCity() {
        return city;
    }

    public List<String> getTrees() {
        return trees;
    }

    public void setTrees(List<String> trees) {
        this.trees = trees;
    }
}