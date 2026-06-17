package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.demo.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao {
	static Map<Integer,Vehicle>vmap;
	static {
		vmap=new HashMap<>();
		vmap.put(12, new Vehicle(12, "Activa", 80000, "6G", LocalDate.of(2026, 04, 9)));
		vmap.put(13, new Vehicle(13, "Vespa", 180000, "vG", LocalDate.of(2026, 04, 9)));
		vmap.put(15, new Vehicle(15, "Jupyter", 98000, "jG", LocalDate.of(2026, 04, 9)));
	}

	@Override
	public boolean save(Vehicle vehicle) {
		if(!vmap.containsKey(vehicle.getVid()))	
				{
					vmap.put(vehicle.getVid(), vehicle);
					return true;
				
				}
		return false;
	}

	@Override
	public boolean removeById(int id) {
		Vehicle v=vmap.remove(id);
		if(v!=null)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public boolean modifyById(int id, double sal) {
	Vehicle v=vmap.get(id);
	if(v!=null)
	{
		v.setPrice(sal);
		return true;
	}
	return false;
	}

	@Override
	public List<Vehicle> findAll() {
		List<Vehicle> vlst=new ArrayList<>();
		for(Integer k:vmap.keySet())
		{
			vlst.add(vmap.get(k));
		}
		return vlst;
	}

	@Override
	public List<Vehicle> getByName(String nm) {
		List<Vehicle>vlst=new ArrayList<>();
		for(Integer k:vmap.keySet())
		{
			Vehicle v=vmap.get(k);
			if(v.getVname().equals(nm))
			{
				vlst.add(v);
			}
		}
		if(vlst.size()>0)
		{
			return vlst;
		}
		return null;
		
	}

	@Override
	public List<Vehicle> getByPrice(double price) {
		
		List<Vehicle>vlist=new ArrayList<>();
		for(Integer k:vmap.keySet()) {
			Vehicle v=vmap.get(k);
			if(v.getPrice()>price)
			{
				vlist.add(v);
			}
		}
		return vlist;
	}

	@Override
	public Map<Integer, Vehicle> sortById() {
	
		Map<Integer,Vehicle>tm=new TreeMap<>();
		for(Map.Entry<Integer, Vehicle> entry:vmap.entrySet())
		{
			tm.put(entry.getKey(),entry.getValue());
		}
		return tm;
		
	}

	@Override
	public List<Vehicle> sortByName() {
		
		List<Vehicle>vlst=findAll();
		vlst.sort(null);
		return vlst;
	}

	@Override
	public List<Vehicle> sortByPrice() {
		
		Comparator<Vehicle> cv=(o1,o2)->
		{
			return (int)(o1.getPrice()-o2.getPrice());
		};
		List<Vehicle> vlst=findAll();
		vlst.sort(cv);
		return vlst;
	}

	@Override
	public Vehicle findById(int id) {
		
		return vmap.get(id);
	}

}
