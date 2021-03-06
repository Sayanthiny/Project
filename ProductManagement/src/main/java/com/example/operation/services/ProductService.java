package com.example.operation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.operation.Entity.Product;
@Service
public interface ProductService {
	
	public List<Product> getAllProduct();
	
	public void addProducts(Product product);

	public void updateProducts(Product product);
	
	public void deleteProduct(String code);
	
	public Product getProduct(String code);


}
