package com.professionalit.test;

import com.professionalit.bean.Car;
import com.professionalit.factory.CarFactroy;

public class FactroryTest {

	public static void main(String[] args) {
		
		Car car1 = CarFactroy.getCar("P");
		car1.drive();

		Car car2 = CarFactroy.getCar("E");
		car2.drive();

	}

}
