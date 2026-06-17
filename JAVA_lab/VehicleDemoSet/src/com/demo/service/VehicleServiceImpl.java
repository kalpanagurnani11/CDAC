package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.dao.VehicleDao;
import com.demo.dao.VehicleDaoImpl;
import com.demo.model.Vehicle;

public class VehicleServiceImpl implements VehicleService {

    private VehicleDao vdao;

    public VehicleServiceImpl() {
        this.vdao = new VehicleDaoImpl();
    }

    @Override
    public boolean addNewVehicle() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter vid:");
        int vid = sc.nextInt();

        System.out.println("Enter vname:");
        String vname = sc.next();

        System.out.println("Enter price:");
        double price = sc.nextDouble();

        System.out.println("Enter model:");
        String model = sc.next();

        System.out.println("Enter date (dd/MM/yyyy):");
        String mfgdate = sc.next();

        LocalDate dt = LocalDate.parse(
                mfgdate,
                DateTimeFormatter.ofPattern("dd/MM/yyyy")
        );

        return vdao.save(new Vehicle(vid, vname, price, model, dt));
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
    public boolean updateById(int id, double price) {
        return vdao.updateById(id, price);
    }

    @Override
    public Set<Vehicle> sortById() {
        return vdao.sortById();
    }

    @Override
    public List<Vehicle> sortByName() {
        return vdao.sortByName();
    }

    @Override
    public List<Vehicle> sortByPrice() {
        return vdao.sortByPrice();
    }

    
    @Override
    public List<Vehicle> getByName(String name) {
        return vdao.findAll()
                .stream()
                .filter(v -> v.getVname().equalsIgnoreCase(name))
                .toList();
    }

	@Override
	public void writeToFile() {
		vdao.writeToFile();
		
	}
}