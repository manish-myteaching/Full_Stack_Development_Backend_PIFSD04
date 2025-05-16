package com.professionalit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.professionalit.dao.DatabaseDAO;

@SpringBootApplication
public class SpringBootPropertyConfigApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootPropertyConfigApplication.class, args);
		DatabaseDAO databaseDAO = ctx.getBean(DatabaseDAO.class);
		databaseDAO.printProperties();
	}

}
