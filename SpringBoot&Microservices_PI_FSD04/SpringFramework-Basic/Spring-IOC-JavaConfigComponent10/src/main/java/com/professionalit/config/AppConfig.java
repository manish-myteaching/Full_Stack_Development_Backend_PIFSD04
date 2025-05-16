package com.professionalit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.professionalit.bean.Car;
import com.professionalit.bean.DieselEngine;
import com.professionalit.bean.ElectricEngine;
import com.professionalit.bean.PetrolEngine;

@Configuration
public class AppConfig {

	@Bean
	public Car getCar() {
		Car car = new Car();
		car.setEngine(getPetrolEngine());// ref
		return car;
	}

	@Bean
	public PetrolEngine getPetrolEngine() {
		return new PetrolEngine();
	}

	@Bean
	public DieselEngine getDieselEngine() {
		return new DieselEngine();
	}

	@Bean
	public ElectricEngine getElectricEngine() {
		return new ElectricEngine();
	}

}
