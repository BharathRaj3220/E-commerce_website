package com.example.ecommerce.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ecommerce.dto.Customer;
import com.example.ecommerce.repository.CustomerRepository;

@Component
public class CustomerDao {
	@Autowired
	CustomerRepository repo;

	public List<Customer> findByEmailOrMobile(String email,long mobile) {
		return repo.findByEmailOrMobile(email,mobile);
	}

	public void save(Customer customer) {
		repo.save(customer);
	}
	
	public void update(Customer customer) {
		repo.save(customer);
	}

	public Customer findById(int id) {
		return repo.findById(id).orElseThrow(null);
	}
}
