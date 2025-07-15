package com.professionalit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.professionalit.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void createProduct(Product product) {
		hibernateTemplate.save(product);
	}

	public Product getProduct(Long id) {
		return hibernateTemplate.get(Product.class, id);
	}

	public void updateProduct(Product product) {
		hibernateTemplate.update(product);
	}

	public void deleteProduct(Long id) {
		hibernateTemplate.delete(id);
	}

	public List<Product> getAllProduct() {
		return hibernateTemplate.loadAll(Product.class);
	}
}
