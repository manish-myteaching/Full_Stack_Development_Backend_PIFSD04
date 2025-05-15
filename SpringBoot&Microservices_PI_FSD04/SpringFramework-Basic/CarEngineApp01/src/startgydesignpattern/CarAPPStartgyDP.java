package startgydesignpattern;

public class CarAPPStartgyDP {

	public static void main(String[] args) {
	
		Car car1=new Car(new PetrolEngine());
		car1.drive();
		
		Car car2=new Car(new DieselEngine());
		car2.drive();
		
		Car car3=new Car();
		car3.setEngine(new ElectricEngine());
		car3.drive();
		
	}

}
