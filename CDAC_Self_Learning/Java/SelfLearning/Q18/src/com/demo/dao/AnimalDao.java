package com.demo.dao;

import java.util.List;
import com.demo.model.Animal;
import com.demo.model.Dog;

public class AnimalDao {


    public void printAnimals(List<? extends Animal> list) {
        for (Animal a : list) {
            a.sound();
        }
    }

    public void addDogs(List<? super Dog> list) {
        list.add(new Dog());
        System.out.println("Dog added in DAO");
    }

    public void printAny(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}