package com.example.operation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.operation.Entity.Product;
import com.example.operation.services.ProductService;
import com.example.operation.util.endPointURL;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
//	@GetMapping("/getPro")
	@GetMapping(value=endPointURL.PRODUCT)
	public List<Product> getPro(){
		return productService.getAllProduct();
	} 
	
//	@PostMapping("/addProduct")
	@PostMapping(value=endPointURL.PRODUCT)
	public void addProducts(@RequestBody Product product) {
		productService.addProducts(product);
	}
	
	
//	@PutMapping("/updateProduct")
	@PutMapping(value=endPointURL.PRODUCT)
	public void updateProduct(@RequestBody Product product) {
		productService.updateProducts(product);
	}
	
//	@PutMapping("/updateProduct")
//	public ResponseEntity<Object> updateProduct(@RequestBody Product product){
//		productService.updateProducts(product);
//		return new ResponseEntity<Object>("updated Successfully", HttpStatus.OK);
//		
//	}
	
//	@DeleteMapping("/deleteProduct/{code}")
	@DeleteMapping(value=endPointURL.PRODUCT_Delete)
	public void deleteProduct(@PathVariable String code) {
		productService.deleteProduct(code);
}

//	@DeleteMapping("/deleteProduct/{code}")
//	public ResponseEntity<Object> deleteProduct(@PathVariable String code){
//		productService.deleteProduct(code);
//		return new ResponseEntity<Object>("deleted successfully", HttpStatus.OK);
//	}
	
	// get 1 specify product
//	@GetMapping("/getProduct/{code}")
	@GetMapping(value=endPointURL.PRODUCT_Delete)
	public Product getProduct(@PathVariable String code){
		return productService.getProduct(code);
		
	}
//	@PostMapping("/addProduct")
//	public ResponseEntity<Object> addProduct(@RequestBody Product product){
//		productService.addProducts(product);
//		return new ResponseEntity<Object>("insert successfully", HttpStatus.OK);
//		
//	}
	
	
	
}
