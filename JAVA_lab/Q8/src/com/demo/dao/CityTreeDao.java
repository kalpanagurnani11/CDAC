package com.demo.dao;

import java.util.List;
import java.util.Map;

public interface CityTreeDao {
    void addCity(String city, List<String> trees);
    List<String> getTrees(String city);
    void deleteCity(String city);
    Map<String, List<String>> getAll();

    // NEW METHODS
    void addTreeToCity(String city, String tree);
}