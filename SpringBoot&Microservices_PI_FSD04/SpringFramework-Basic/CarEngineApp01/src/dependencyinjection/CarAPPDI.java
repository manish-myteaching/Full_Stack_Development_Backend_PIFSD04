package dependencyinjection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class CarAPPDI {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
		// Constructor injection
		Car car1 = new Car(new Engine());
		car1.drive();

		// setter injection
		Car car2 = new Car();
		car2.setEngine(new Engine());
		car2.drive();
		
		//Field injection
		//Load the car class dynamically
		//Load into jvm
		Class<?> clz=Class.forName("dependencyinjection.Car");
		Field field=clz.getDeclaredField("engine");
		field.setAccessible(true);	
		//create object of Car class
		Object object=clz.getDeclaredConstructor().newInstance();	
		// inject Engine object using field injection
		field.set( object,new Engine());
		
		//Cast the object to Car
		Car car= (Car) object;
		car.drive();	
	}

}
