package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import startgydesignpattern.Engine;
import startgydesignpattern.PetrolEngine;



public class CarDIFieldInjectionTest {
	 public static void main(String[] args) {
	        try {
	            // Create an instance of Engine
	            Engine engine = new PetrolEngine();

	            // Create an instance of CarDI using reflection
	            Class<?> carDIClass = Class.forName("startgydesignpattern.CarDI");
	            Constructor<?> carDIConstructor = carDIClass.getConstructor();
	            Object carDIInstance = carDIConstructor.newInstance();

	            // Set the Engine instance using reflection
	            Field engineField = carDIClass.getDeclaredField("engine");
	            engineField.setAccessible(true); // Allows access to private fields
	            engineField.set(carDIInstance, engine);

	            // Call the drive method
	            carDIClass.getMethod("drive").invoke(carDIInstance);
	        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
	                 IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
	            e.printStackTrace();
	        }
	    }

}
