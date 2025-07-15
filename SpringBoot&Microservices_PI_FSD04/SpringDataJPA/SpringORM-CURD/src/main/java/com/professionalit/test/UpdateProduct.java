package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.professionalit.config.HibernateConfig;
import com.professionalit.entity.Product;
import com.professionalit.service.ProductService;
import com.professionalit.service.ProductServiceImpl;

public class UpdateProduct {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HibernateConfig.class);
		ProductService productService = applicationContext.getBean(ProductService.class,"productServiceImpl");		
		// Create a new user
		Product product = new Product();
		product.setId(1L);
		product.setName("kk");
		product.setPrice(2000.00);
		product.setQuantity(2);
		productService.updateProduct(product);

	}

}
