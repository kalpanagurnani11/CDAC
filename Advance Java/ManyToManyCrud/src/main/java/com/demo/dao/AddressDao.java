package com.demo.dao;

import com.demo.model.Address;

public interface AddressDao {

	boolean saveAddress(Address a);

	Address findAddress(int aid);

}
