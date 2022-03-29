package com.example.operation.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.operation.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {	
	
}
