package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
	public boolean addNewVehicle() {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter vid");
		int vid=sc.nextInt();
		System.out.println("enter vname");
		String vname=sc.next();
		System.out.println("enter price");
		double price=sc.nextDouble();
		System.out.println("enter model");
		String model=sc.next();
		System.out.println("enter date");
		String mfgdate=sc.next();
		LocalDate dt=LocalDate.parse(mfgdate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return vdao.save(new Vehicle(vid,vname,price,model,dt));

	}


	@Override
	public Set<Vehicle> getAll() {
		return vdao.findAll();
	}


	@Override
	public Vehicle getById(int id) {
		return vdao.findById(id);
	}


	@Override
	public List<Vehicle> getByPrice(double price) {
		return vdao.findByPrice(price);
	}


	@Override
	public boolean deleteById(int id) {
		return vdao.deleteById(id);
	}


	@Override
	public boolean updateById(int id,double price) {
		// TODO Auto-generated method stub
		return vdao.updateById(id,price);
	}


	@Override
	public Set<Vehicle> sortById() {
		// TODO Auto-generated method stub
		return vdao.sortById();
	}


	@Override
	public List<Vehicle> sortByName() {
		// TODO Auto-generated method stub
		return vdao.sortByName();
	}


	@Override
	public List<Vehicle> sortByPrice() {
		// TODO Auto-generated method stub
		return vdao.sortByPrice();
	}
	

}
