package com.qa.services;

import java.util.List;

import com.qa.persistence.dao.Dao;
import com.qa.persistence.domain.Customer;
import com.qa.services.CustomerServices;

public class CustomerServices implements CrudServices<Customer> {

	Dao<Customer> customerDao;
	
	public CustomerServices(Dao<Customer> customerDao) {
		this.customerDao = customerDao;
	}
	
	public List<Customer> readAll() {
		return customerDao.readAll();
	}

	public void create(Customer customer) {
		customerDao.create(customer);
	}

	public void update(long id, Customer t) {
		
	}

	public void delete(Long id) {
		
	}


}
