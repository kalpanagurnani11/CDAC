package com.demo.service;

import java.util.Scanner;

import com.demo.dao.AddressDao;
import com.demo.dao.AddressDaoImpl;
import com.demo.model.Address;

public class AddressServiceImpl implements AddressService {
	
	private AddressDao adao;

	public AddressServiceImpl() {
		
		this.adao = new AddressDaoImpl();
	}


	@Override
	public boolean addAddress() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter aid");
		int pi=sc.nextInt();
		System.out.println("enter street");
		String s=sc.next();
		System.out.println("enter city");
		String c=sc.next();
		System.out.println("enter state");
		String st=sc.next();
		Address a=new Address(pi,s,c,st);
		return adao.saveAddress(a);
	}

	@Override
	public Address displayAddress(int aid) {
		// TODO Auto-generated method stub
		return adao.findAddress(aid);
	}

}
