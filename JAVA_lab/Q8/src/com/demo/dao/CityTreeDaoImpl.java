package com.demo.dao;

import java.util.*;

public class CityTreeDaoImpl implements CityTreeDao {

    private TreeMap<String, List<String>> map = new TreeMap<>();

    @Override
    public void addCity(String city, List<String> trees) {
        map.put(city, new ArrayList<>(trees));
    }

    @Override
    public List<String> getTrees(String city) {
        return map.get(city);
    }

    @Override
    public void deleteCity(String city) {
        map.remove(city);
    }

    @Override
    public Map<String, List<String>> getAll() {
        return map;
    }

    @Override
    public void addTreeToCity(String city, String tree) {
        if (map.containsKey(city)) {
            map.get(city).add(tree);
        }
    }
}