package com.professionalit.bean;

public class Car {
	private static Car INSTANCE;
	private IEngine engine;

	public void setEngine(IEngine engine) {
		System.out.println("Engine pass throught setter");
		this.engine = engine;
	}

	private Car() {
		System.out.println("Car object is created.");
	}

	public static synchronized Car getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Car();
		}
		return INSTANCE;
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
