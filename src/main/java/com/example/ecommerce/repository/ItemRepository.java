package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.dto.Item;

public interface ItemRepository extends JpaRepository<Item,Integer>{

}
