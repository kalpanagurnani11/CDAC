package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.model.Vehicle;

public interface VehicleDao {

	boolean save(Vehicle vehicle);

	boolean removeById(int id);

	boolean modifyById(int id, double sal);

	List<Vehicle> findAll();

	List<Vehicle> getByName(String nm);

	List<Vehicle> getByPrice(double price);

	Map<Integer, Vehicle> sortById();

	List<Vehicle> sortByName();

	List<Vehicle> sortByPrice();

	Vehicle findById(int id);

}
