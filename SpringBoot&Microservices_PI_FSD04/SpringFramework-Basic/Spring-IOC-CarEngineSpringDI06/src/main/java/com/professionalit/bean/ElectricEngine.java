package com.professionalit.bean;

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
