package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.model.Vehicle;

public interface VehicleDao {

	boolean save(Vehicle vehicle);

	Set<Vehicle> findAll();

	Vehicle findById(int id);

	List<Vehicle> findByPrice(double price);

	boolean deleteById(int id);

	boolean updateById(int id,double price);

	Set<Vehicle> sortById();

	List<Vehicle> sortByName();

	List<Vehicle> sortByPrice();

	void readFromFile();

	void writeToFile();

}
