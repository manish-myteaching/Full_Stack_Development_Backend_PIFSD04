package com.professionalit.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class MyInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	public MyInitializer() {
		System.out.println("MyInitializer Object Created");
	}

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("MyInitializer");
		applicationContext.setId("Test");
	}

}
