package com.professionalit.service;

import java.util.List;

import com.professionalit.model.Product;

public interface ProductService  {
	
	public void createProduct(Product product);

	public Product getProductById(Long id);

	public void updateProduct(Product product);

	public void deleteProduct(Long id);

	public List<Product> getAllProducts();


}
