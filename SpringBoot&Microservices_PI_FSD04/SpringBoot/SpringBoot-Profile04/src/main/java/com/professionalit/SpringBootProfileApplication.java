package com.professionalit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.professionalit.service.ReportGenerateService;

@SpringBootApplication
public class SpringBootProfileApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootProfileApplication.class, args);
		ReportGenerateService reportGenerateService = ctx.getBean(ReportGenerateService.class);
		reportGenerateService.generateReport("excel");

		int beanCount = ctx.getBeanDefinitionCount();
		//System.out.println("Number of beans in the IoC container: " + beanCount);

		String[] beanNames = ctx.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			//System.out.println("Bean name: " + beanName);

		}
	}

}
