package com.professionalit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.professionalit.controller.UserController;
import com.professionalit.vo.User;

@SpringBootApplication
public class SpringBootCoreRealTimeUsecaseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=	SpringApplication.run(SpringBootCoreRealTimeUsecaseApplication.class, args);		
		UserController userController= ctx.getBean(UserController.class);
		
		User user = new User();
		user.setUserName("Ramesh");
		user.setUserPhoneNo("+91-55552520");
		user.setEmailID("Ramesh@gmail.com");
		user.setUserID("Ramesh123");
		user.setPassword("123");
		userController.createUserDetail(user);
	}

}
