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

        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("Using Iterator:");
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String city = it.next();
            System.out.println(city + " -> " + map.get(city));
        }
    }

    @Override
    public void addTree(String city, String tree) {
        if (dao.getAll().containsKey(city)) {
            dao.addTreeToCity(city, tree);
        } else {
            System.out.println("City not found!");
        }
    }

    @Override
    public void findCitiesByTree(String tree) {
        Map<String, List<String>> map = dao.getAll();

        boolean found = false;
        for (String city : map.keySet()) {
            if (map.get(city).contains(tree)) {
                System.out.println(city);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Tree not found in any city");
        }
    }
}