package com.professionalit.service;

import java.util.List;

import com.professionalit.entity.Product;

public interface ProductService {
	
	public void createProduct(Product Product );
	
	public Product getProduct(Long id);
	
	public void updateProduct(Product Product);
	
	public void deleteProduct(Long id) ;
	
	public List<Product> getAllProducts();
	

}
