package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.professionalit.config.JdbcConfig;
import com.professionalit.model.Product;
import com.professionalit.service.ProductService;

public class InsertProduct {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ApplicationContext applicationContext = new
		// AnnotationConfigApplicationContext(JdbcConfig.class);
		ProductService productService = applicationContext.getBean(ProductService.class, "productServiceImpl");

		// Create a new user
		Product product = new Product();
		product.setId(8L);
		product.setName("Sampoo");
		product.setPrice(2000.00);
		product.setQuantity(2);
		productService.createProduct(product);
	}
}
