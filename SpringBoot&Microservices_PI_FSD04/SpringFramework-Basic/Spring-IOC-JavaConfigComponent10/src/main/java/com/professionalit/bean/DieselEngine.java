package com.professionalit.bean;

import org.springframework.stereotype.Component;

public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine object is created.");
	}

	@Override
	public int start() {
		System.out.println("Diesel Engine Started..!");
		return 1;
	}

}
