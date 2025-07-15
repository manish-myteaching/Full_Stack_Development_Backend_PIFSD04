package com.professionalit.dao;

import java.util.List;

import com.professionalit.model.Product;

public interface ProductDAO {

	public void createProduct(Product product);

	public Product getProductById(Long id);

	public void updateProduct(Product product);

	public void deleteProduct(long id);

	public List<Product> getAllProducts();

}
