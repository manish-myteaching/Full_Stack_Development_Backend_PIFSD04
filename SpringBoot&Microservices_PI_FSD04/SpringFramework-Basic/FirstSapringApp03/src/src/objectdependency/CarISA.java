package objectdependency;

public class CarISA extends Engine {

	public void drive() {
		int status = super.start();
		if (status >= 1) {
			System.out.println("Journy Starat..!");
		} else {
			System.out.println("Engine is not working..!");
		}
	}
}
