package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demo.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao {
	
	static Set<Vehicle> vset;
	static {
		vset=new HashSet<>();
		vset.add(new Vehicle(12,"Activa",80000,"5G",LocalDate.of(2026, 12, 1)));
		vset.add(new Vehicle(13,"Curve",85000,"3G",LocalDate.of(2025, 11, 1)));
		vset.add(new Vehicle(14,"Dio",75000,"4G",LocalDate.of(2024, 1, 12)));
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
		for(Vehicle v:vset)
		{
			if(v.getVid()==id)
			{
				return v;
			}
		}
		return null;
	}

	@Override
	public List<Vehicle> findByPrice(double price) {
		List<Vehicle>lst=vset.stream().filter(v->v.getPrice()>price).toList();
	 
		return lst.size()>0?lst:null;
	
	
	}

	@Override
	public boolean deleteById(int id) {
		for(Vehicle v:vset)
		{
			if(v.getVid()==id)
			{
				vset.remove(id);
			}
		}
		return false;
	}

	@Override
	public boolean updateById(int id,double price) {
		Vehicle v=findById(id);
		if(v!=null)
		{
			v.setPrice(price);
		}
		return false;
	}

	@Override
	public Set<Vehicle> sortById() {
		Set<Vehicle>tset=new TreeSet<>();
		for(Vehicle v:vset)
		{
			tset.add(v);
		}
		return tset;
	}

	@Override
	public List<Vehicle> sortByName() {
		Comparator<Vehicle>cv=(o1,o2)->{
			return o1.getVname().compareTo(o2.getVname());
			
		};
		List<Vehicle>lst=new ArrayList<>();
		for(Vehicle v:vset)
		{
			lst.add(v);
			
		}
		lst.sort(cv);
		return lst;
	}

	@Override
	public List<Vehicle> sortByPrice() {
		Comparator<Vehicle>cv=(o1,o2)->{
			return(int)(o1.getPrice()-o2.getPrice());
			
		};
		List<Vehicle>lst=new ArrayList<>();
		for(Vehicle v:vset)
		{
			lst.add(v);
			
		}
		lst.sort(cv);
		return lst;
	}

}
