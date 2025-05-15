package objectdependency;

public class CarAPP {

	public static void main(String[] args) {
		CarISA carISA = new CarISA();
		carISA.drive();
		
		CarHasA carHasA = new CarHasA();
		carHasA.drive();
	}

}
