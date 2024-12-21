package com.example.Product_Management_System.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Product_Management_System.entity.Product;
import com.example.Product_Management_System.repository.ProductRepository;
@Service
public class ProductService {
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	public void saveAll(Product product) {
		productRepository.save(product);		
	}

	public List<Product> findAll() {
		return productRepository.findAll();
		
	}

	public void deleteById(int productId) {
		productRepository.deleteById(productId);;
		
	}

	public Product updateById(int productId) {
		 return productRepository.findById(productId).orElseThrow();
		
	}

	public void updateProduct(Product product) {
		productRepository.save(product);
		
	}

	

}
