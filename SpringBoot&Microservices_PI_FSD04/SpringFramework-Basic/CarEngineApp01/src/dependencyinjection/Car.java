package dependencyinjection;

public class Car {

	private Engine engine;

	public Car() {
	}

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
		int status = engine.start();
		if (status >= 1) {
			System.out.println("Journy Started..!");
		} else {
			System.out.println("Engine is not working..!");
		}
	}
}
