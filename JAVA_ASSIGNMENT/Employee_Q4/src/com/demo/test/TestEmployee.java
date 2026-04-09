package com.demo.test;

import java.util.*;

import com.demo.model.Employee;

public class TestEmployee {

    public static void main(String[] args) {

      
        HashSet<Employee> set = new HashSet<>();

        set.add(new Employee(1,"A",50000,"IT","Dev"));
        set.add(new Employee(2,"B",60000,"HR","Mgr"));
        set.add(new Employee(1,"C",70000,"IT","Lead")); 

        System.out.println("HashSet Data:");
        for(Employee e : set) {
            System.out.println(e);
        }

        TreeMap<Integer, Employee> map = new TreeMap<>();

        map.put(3, new Employee(3,"X",40000,"IT","Dev"));
        map.put(1, new Employee(1,"Y",80000,"HR","Mgr"));
        map.put(2, new Employee(2,"Z",55000,"Sales","Exec"));

        System.out.println("\nTreeMap Data:");
        for(Integer key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}