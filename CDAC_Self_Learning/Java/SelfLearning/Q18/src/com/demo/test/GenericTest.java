package com.demo.test;

import java.util.*;
import com.demo.model.*;
import com.demo.service.AnimalService;

public class GenericTest {

    public static void main(String[] args) {

        AnimalService service = new AnimalService();

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());

        List<Animal> animalList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();
        service.showAnimals(dogList);
        service.insertDogs(animalList);
        service.insertDogs(objList);
        service.showAll(dogList);
    }
}