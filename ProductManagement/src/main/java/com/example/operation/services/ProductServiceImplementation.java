package com.example.operation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.operation.Entity.Product;
import com.example.operation.Repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public void addProducts(Product product) {
		productRepository.save(product);
	}

	@Override
	public void updateProducts(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
	}

	@Override
	public void deleteProduct(String code) {
		productRepository.deleteById(code);
		
	}

	@Override
	public Product getProduct(String code) {
		// TODO Auto-generated method stub
		return productRepository.findById(code).get();

	}

//	@Override
//	public List<Product> getProduct() {
//		// TODO Auto-generated method stub
//		return productRepository.getById(code);
//	}
//	
	
	
	
	
}
