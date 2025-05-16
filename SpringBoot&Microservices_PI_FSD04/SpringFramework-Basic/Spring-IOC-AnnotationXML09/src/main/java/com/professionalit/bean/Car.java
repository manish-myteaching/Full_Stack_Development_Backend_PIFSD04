package com.professionalit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	@Qualifier("dieselEngine")
	private IEngine engine;

	public void setEngine(IEngine engine) {
		System.out.println("Engine pass throught setter");
		this.engine = engine;
	}

	public Car() {
		System.out.println("Car object is created.");
	}

	public void drive() {
		int status = engine.start();
		if (status >= 1) {
			System.out.println("Journy Started..!");
		} else {
			System.out.println("Engine is not working..!");
		}

	}

}
