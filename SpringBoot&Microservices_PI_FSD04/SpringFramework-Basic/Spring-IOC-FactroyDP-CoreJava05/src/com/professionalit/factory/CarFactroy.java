package com.professionalit.factory;

import com.professionalit.bean.Car;
import com.professionalit.bean.DieselEngine;
import com.professionalit.bean.ElectricEngine;
import com.professionalit.bean.PetrolEngine;

public class CarFactroy {

	public static Car getCar(String engine) {
		Car car = Car.getInstance();
		if ("P".equalsIgnoreCase(engine)) {
			car.setEngine(new PetrolEngine()); // DI
		} else if ("D".equalsIgnoreCase(engine)) {
			car.setEngine(new DieselEngine()); // DI
		} else if ("E".equalsIgnoreCase(engine)) {
			car.setEngine(new ElectricEngine()); // DI
		} else {
			System.out.println("Car is not avalibale");
		}
		return car;
	}

}
