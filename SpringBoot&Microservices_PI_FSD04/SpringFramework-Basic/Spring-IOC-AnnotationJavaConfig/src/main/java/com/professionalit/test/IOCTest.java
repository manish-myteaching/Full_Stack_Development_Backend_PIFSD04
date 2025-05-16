package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.professionalit.bean.Car;

public class IOCTest {

	public static void main(String[] args) {
		// IOC Container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./applicationContext.xml");
		Car car = applicationContext.getBean("car", Car.class);
		car.drive();

	}

}
