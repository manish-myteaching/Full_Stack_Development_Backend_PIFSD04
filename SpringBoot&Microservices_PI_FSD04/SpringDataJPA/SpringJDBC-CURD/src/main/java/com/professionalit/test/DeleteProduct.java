package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.professionalit.config.JdbcConfig;
import com.professionalit.service.ProductService;

public class DeleteProduct {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JdbcConfig.class);
		ProductService productService = applicationContext.getBean(ProductService.class,"productServiceImpl");		
		productService.deleteProduct(9L);
	}

}
