package com.professionalit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.professionalit.initializer.MyInitializer;

@SpringBootApplication
public class SpringBootInitializerListernerApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringBootInitializerListernerApplication.class);
		springApplication.addInitializers(new MyInitializer());
		ConfigurableApplicationContext ctx = springApplication.run(args);
		System.out.println(ctx.getId());
	}

}
