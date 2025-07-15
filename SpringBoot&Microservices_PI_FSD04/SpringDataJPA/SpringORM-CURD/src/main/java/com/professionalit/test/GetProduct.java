package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.professionalit.config.HibernateConfig;
import com.professionalit.entity.Product;
import com.professionalit.service.ProductService;

public class GetProduct {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HibernateConfig.class);
		ProductService productService = applicationContext.getBean(ProductService.class,"productServiceImpl");		
		Product product = productService.getProduct(1L);
		System.out.println(product);
	}

}
