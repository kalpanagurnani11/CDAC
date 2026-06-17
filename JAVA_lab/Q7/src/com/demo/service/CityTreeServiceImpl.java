package com.demo.service;

import com.demo.dao.*;
import java.util.*;

public class CityTreeServiceImpl implements CityTreeService {

    private CityTreeDao dao = new CityTreeDaoImpl();

    @Override
    public void addCity(String city, List<String> trees) {
        if (dao.getAll().containsKey(city)) {
            System.out.println("City already exists!");
        } else {
            dao.addCity(city, trees);
        }
    }

    @Override
    public List<String> findTrees(String city) {
        return dao.getTrees(city);
    }

    @Override
    public void deleteCity(String city) {
        dao.deleteCity(city);
    }

    @Override
    public void displayAll() {
        Map<String, List<String>> map = dao.getAll();

        // foreach
        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // iterator
        System.out.println("Using Iterator:");
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String city = it.next();
            System.out.println(city + " -> " + map.get(city));
        }
    }
}