package com.professionalit.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.professionalit.dao.ProductDAO;
import com.professionalit.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDao;

	@Transactional
	public void createProduct(Product Product) {

		productDao.createProduct(Product);
	}

	@Transactional
	public Product getProduct(Long id) {
		return productDao.getProduct(id);
	}

	@Transactional
	public List<Product> getAllProducts() {
		return productDao.getAllProduct();
	}

	@Transactional
	public void updateProduct(Product Product) {
		productDao.updateProduct(Product);
	}

	@Transactional
	public void deleteProduct(Long id) {
		productDao.deleteProduct(id);
	}

}
