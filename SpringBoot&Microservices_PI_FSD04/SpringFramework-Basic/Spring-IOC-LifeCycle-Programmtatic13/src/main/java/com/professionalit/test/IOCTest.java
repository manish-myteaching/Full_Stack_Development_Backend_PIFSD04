package com.professionalit.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.professionalit.bean.SpringBean;

public class IOCTest {

	public static void main(String[] args) {

		// SpringBean springBean = new SpringBean();
		// springBean.show();

		// IOC Container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"./applicationContext.xml");
		SpringBean sb = applicationContext.getBean(SpringBean.class);
		sb.show();
		sb.display();
		applicationContext.close();

	}

}
