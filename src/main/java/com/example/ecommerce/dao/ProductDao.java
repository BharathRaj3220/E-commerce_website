package com.example.ecommerce.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.dto.Item;
import com.example.ecommerce.dto.Product;
import com.example.ecommerce.repository.ItemRepository;
import com.example.ecommerce.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ItemRepository itemRepository;

	public void save(Product product) {
		productRepository.save(product);
	}

	public List<Product> fetchAll() {
		return productRepository.findAll();
	}

	public Product findById(int id) {
		return productRepository.findById(id).orElse(null);
	}

	public void deleteById(int id) {
		productRepository.deleteById(id);
	}
	
	public List<Product> fetchDisplayProducts() {
		return productRepository.findByDisplayTrue();
	}
	
	public void deleteItem(Item item)
	{
		itemRepository.delete(item);
	}
}
