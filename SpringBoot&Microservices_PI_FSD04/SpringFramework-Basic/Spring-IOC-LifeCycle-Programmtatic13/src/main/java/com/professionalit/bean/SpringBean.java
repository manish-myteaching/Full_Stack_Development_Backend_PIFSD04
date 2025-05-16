package com.professionalit.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {

	public SpringBean() {
		System.out.println("SpringBean");
	}

	public void show() {
		System.out.println("show-business-Logic");
		System.out.println("Fetch Data from oracle Database");
	}
	
	public void display() {
		System.out.println("display-business-Logic");
		System.out.println("Fetch Data from Mysql Database");
	}

	@PostConstruct
	public void init() {
		System.out.println("init");
		System.out.println("Establish Connection with database..!");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
		System.out.println("Destroy Connection with database..!");
	}

}
