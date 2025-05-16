package com.professionalit.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine object is created.");
	}

	@Override
	public int start() {
		System.out.println("Petrol Engine Started..!");
		return 1;
	}

}
