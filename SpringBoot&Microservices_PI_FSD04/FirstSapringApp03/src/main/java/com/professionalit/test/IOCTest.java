package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.professionalit.bean.Product;

public class IOCTest {

	public static void main(String[] args) {

		// IOC Container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./applicationContext.xml");
		Product product=(Product)applicationContext.getBean("product");
		product.getProduct();
		
		Product product1=(Product)applicationContext.getBean("product");
       System.out.println(product.hashCode() + " "+ product1.hashCode() );
	}

}
