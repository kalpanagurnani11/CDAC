package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.model.Vehicle;

public interface VehicleService {

	boolean addNewVehicle();

	Set<Vehicle> getAll();

	Vehicle getById(int id);

	List<Vehicle> getByPrice(double price);

	boolean deleteById(int id);

	boolean updateById(int id, double price);

	Set<Vehicle> sortById();

	List<Vehicle> sortByName();

	List<Vehicle> sortByPrice();

	List<Vehicle> getByName(String name);

	void writeToFile();

}
