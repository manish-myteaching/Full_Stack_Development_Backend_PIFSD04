package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.professionalit.config.HibernateConfig;
import com.professionalit.entity.Product;
import com.professionalit.service.ProductService;

public class InsertProduct {
	public static void main(String[] args) {
		// ApplicationContext applicationContext = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HibernateConfig.class);	
		ProductService productService = applicationContext.getBean(ProductService.class, "productServiceImpl");
		// Create a new user
		Product product = new Product();
		// product.setId(5L);
		product.setName("Shampoo");
		product.setPrice(2030.00);
		product.setQuantity(4);
		productService.createProduct(product);
	}
}
