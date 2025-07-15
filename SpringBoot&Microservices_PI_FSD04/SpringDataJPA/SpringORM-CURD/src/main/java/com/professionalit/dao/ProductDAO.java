package com.professionalit.dao;

import java.util.List;

import com.professionalit.entity.Product;

public interface ProductDAO {
	
	public void createProduct(Product product) ;
	
	public Product getProduct(Long id);
	
	public void updateProduct(Product product);
	
	public void deleteProduct(Long id);
	
	public List<Product> getAllProduct();

}
