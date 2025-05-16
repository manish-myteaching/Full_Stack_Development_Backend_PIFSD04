package objectdependency;

public class CarHasA {
	public void drive() {
		Engine engine = new Engine();
		int status = engine.start();
		if (status >= 1) {
			System.out.println("Journy Started..!");
		} else {
			System.out.println("Engine is not working..!");
		}
	}
}
