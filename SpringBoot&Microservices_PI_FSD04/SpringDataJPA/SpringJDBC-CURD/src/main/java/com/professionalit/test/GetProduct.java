package com.professionalit.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.professionalit.config.JdbcConfig;
import com.professionalit.dao.ProductDAOImpl;
import com.professionalit.model.Product;
import com.professionalit.service.ProductService;
import com.professionalit.service.ProductServiceImpl;

public class GetProduct {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JdbcConfig.class);
		ProductService productService = applicationContext.getBean(ProductService.class, "productServiceImpl");
	
		Product product = productService.getProductById(8L);
		System.out.println(product);
	}

}
