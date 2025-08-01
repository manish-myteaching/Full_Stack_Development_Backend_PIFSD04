package com.professionalit.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.professionalit.config.JdbcConfig;
import com.professionalit.model.Product;
import com.professionalit.service.ProductService;
import com.professionalit.service.ProductServiceImpl;

public class GetAllProduct {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JdbcConfig.class);
		ProductService productService = applicationContext.getBean(ProductService.class, "productServiceImpl");
		List<Product> listProduct = productService.getAllProducts();
		for (Product product : listProduct) {
			System.out.println(product);
		}

	}

}
