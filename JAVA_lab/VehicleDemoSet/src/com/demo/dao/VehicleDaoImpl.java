package com.demo.dao;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

import com.demo.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao {

    static Set<Vehicle> vset;

    static {
        vset = new HashSet<>();
        vset.add(new Vehicle(12, "Activa", 80000, "5G", LocalDate.of(2026, 12, 1)));
        vset.add(new Vehicle(13, "Curve", 85000, "3G", LocalDate.of(2025, 11, 1)));
        vset.add(new Vehicle(14, "Dio", 75000, "4G", LocalDate.of(2024, 1, 12)));
    }

    @Override
    public boolean save(Vehicle vehicle) {
        return vset.add(vehicle);
    }

    @Override
    public Set<Vehicle> findAll() {
        return vset;
    }

    @Override
    public Vehicle findById(int id) {
        for (Vehicle v : vset) {
            if (v.getVid() == id) {
                return v;
            }
        }
        return null;
    }

    @Override
    public List<Vehicle> findByPrice(double price) {
        List<Vehicle> list = vset.stream()
                .filter(v -> v.getPrice() > price)
                .toList();
        return list.size() > 0 ? list : null;
    }

    @Override
    public boolean deleteById(int id) {
        Vehicle v = findById(id);
        if (v != null) {
            return vset.remove(v);
        }
        return false;
    }

    @Override
    public boolean updateById(int id, double price) {
        Vehicle v = findById(id);
        if (v != null) {
            v.setPrice(price);
            return true;
        }
        return false;
    }

    @Override
    public Set<Vehicle> sortById() {
        Set<Vehicle> tset = new TreeSet<>();
        tset.addAll(vset);
        return tset;
    }

    @Override
    public List<Vehicle> sortByName() {
        List<Vehicle> list = new ArrayList<>(vset);
        list.sort((o1, o2) -> o1.getVname().compareTo(o2.getVname()));
        return list;
    }

    @Override
    public List<Vehicle> sortByPrice() {
        List<Vehicle> list = new ArrayList<>(vset);
        list.sort((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        return list;
    }

    @Override
    public void writeToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("vehicle.txt"))) {
            oos.writeObject(vset);
            System.out.println("Data written using ObjectOutputStream");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("vehicle.txt"))) {
            Object obj = ois.readObject();
            if (obj instanceof Set) {
                vset = (Set<Vehicle>) obj;
            }
            System.out.println("Data read using ObjectInputStream");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}