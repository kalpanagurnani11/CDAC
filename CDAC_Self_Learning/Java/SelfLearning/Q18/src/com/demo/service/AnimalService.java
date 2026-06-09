package com.demo.service;

import com.demo.dao.AnimalDao;
import java.util.List;
import com.demo.model.*;

public class AnimalService {

    private AnimalDao dao = new AnimalDao();

    public void showAnimals(List<? extends Animal> list) {
        dao.printAnimals(list);
    }

    public void insertDogs(List<? super Dog> list) {
        dao.addDogs(list);
    }

    public void showAll(List<?> list) {
        dao.printAny(list);
    }
}