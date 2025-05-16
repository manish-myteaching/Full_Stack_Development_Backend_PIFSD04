package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.professionalit.controller.UserController;
import com.professionalit.vo.User;

public class IOCTest {

	public static void main(String[] args) {

		// IOC Container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./applicationContext.xml");
		
		UserController userController=(UserController)applicationContext.getBean("userController");
		//userController.getUserDetail();
		
		User user = new User();
		user.setUserName("Ramesh");
		user.setUserPhoneNo("+91-55552520");
		user.setEmailID("Ramesh@gmail.com");
		user.setUserID("Ramesh123");
		user.setPassword("123");	
		userController.createUserDetail(user);
	}

}
