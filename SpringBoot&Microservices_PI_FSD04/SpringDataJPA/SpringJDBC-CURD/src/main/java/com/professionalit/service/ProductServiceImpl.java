package com.professionalit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.professionalit.dao.ProductDAO;
import com.professionalit.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO ProductDao;

	@Transactional
	public void createProduct(Product Product) {
		ProductDao.createProduct(Product);
	}

	@Transactional
	public Product getProductById(Long id) {
		return ProductDao.getProductById(id);
	}

	@Transactional
	public List<Product> getAllProducts() {
		return ProductDao.getAllProducts();
	}

	@Transactional
	public void updateProduct(Product Product) {
		ProductDao.updateProduct(Product);
	}

	@Transactional
	public void deleteProduct(Long id) {
		ProductDao.deleteProduct(id);
	}

	
}
