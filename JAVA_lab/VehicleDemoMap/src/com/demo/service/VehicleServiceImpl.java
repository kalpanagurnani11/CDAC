package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.dao.VehicleDao;
import com.demo.dao.VehicleDaoImpl;
import com.demo.model.Vehicle;

public class VehicleServiceImpl implements VehicleService{
	private VehicleDao vdao;
	

	public VehicleServiceImpl() {
		super();
		this.vdao=new VehicleDaoImpl();
	}

	@Override
	public boolean addVehicle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr vehicle id");
		int vid = sc.nextInt();
		System.out.println("Enter vehicle name");
		String vname = sc.next();
		System.out.println("Enter price");
		double price = sc.nextDouble();
		System.out.println("Enter model");
		String model = sc.next();
		System.out.println("Enter date (dd/mm/yyyy)");
		String date = sc.next();
		LocalDate ldt = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		return vdao.save(new Vehicle(vid, vname, price, model,ldt));
		
	}

	@Override
	public boolean deleteVehicle(int id) {

		return vdao.removeById(id);
	}

	@Override
	public boolean updateVehicle(int id, double sal) {
		
		return vdao.modifyById(id,sal);
	}

	@Override
	public List<Vehicle> getAll() {
		
		return vdao.findAll();
	}

	@Override
	public List<Vehicle> getByName(String nm) {
		// TODO Auto-generated method stub
		return vdao.getByName(nm);
	}

	@Override
	public Vehicle getById(int id) {
		return vdao.findById(id);
	}

	@Override
	public List<Vehicle> getByPrice(double price) {		// TODO Auto-generated method stub
		return vdao.getByPrice(price);
	}

	@Override
	public Map<Integer, Vehicle> sortById() {
		// TODO Auto-generated method stub
		return vdao.sortById();
	}

	@Override
	public List<Vehicle> sortByName() {
		// TODO Auto-generated method stub
		return vdao.sortByName();
	}

	@Override
	public List<Vehicle> sortByprice() {
		// TODO Auto-generated method stub
		return vdao.sortByPrice();
	}

}
