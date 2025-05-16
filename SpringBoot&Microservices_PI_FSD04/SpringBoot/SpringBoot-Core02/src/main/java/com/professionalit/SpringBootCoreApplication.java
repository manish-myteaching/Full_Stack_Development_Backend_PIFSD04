package com.professionalit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootCoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cx = SpringApplication.run(SpringBootCoreApplication.class, args);
		System.out.println("IOC Container: " + cx.getClass().getName());
	}

}
