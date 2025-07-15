package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.professionalit.config.HibernateConfig;
import com.professionalit.service.ProductServiceImpl;

public class DeleteProduct {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HibernateConfig.class);
		ProductServiceImpl productDao = applicationContext.getBean(ProductServiceImpl.class);
		productDao.deleteProduct(2L);
	}

}
