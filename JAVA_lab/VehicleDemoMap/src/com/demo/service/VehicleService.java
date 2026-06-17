package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.model.Vehicle;

public interface VehicleService {

	boolean addVehicle();

	boolean deleteVehicle(int id);

	boolean updateVehicle(int id, double sal);

	List<Vehicle> getAll();

	List<Vehicle> getByName(String nm);

	Vehicle getById(int id);

	List<Vehicle> getByPrice(double price);

	Map<Integer, Vehicle> sortById();

	List<Vehicle> sortByName();

	List<Vehicle> sortByprice();

}
