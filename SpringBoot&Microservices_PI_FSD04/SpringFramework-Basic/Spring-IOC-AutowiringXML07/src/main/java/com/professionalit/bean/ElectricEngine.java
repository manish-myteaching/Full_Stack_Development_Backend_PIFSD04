package com.professionalit.bean;

import org.springframework.stereotype.Component;


public class ElectricEngine implements IEngine {
	
	public ElectricEngine() {
		System.out.println("ElectricEngine object is created.");
	}

	@Override
	public int start() {
		System.out.println("Electric Engine Started..!");
		return 1;
	}

}
