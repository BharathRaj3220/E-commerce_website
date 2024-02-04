package com.example.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.dto.Customer;
import com.example.ecommerce.dto.ShoppingOrder;

public interface ShoppingOrderRepository extends JpaRepository<ShoppingOrder, Integer>{
	List<ShoppingOrder> findByCustomer(Customer customer);
}
