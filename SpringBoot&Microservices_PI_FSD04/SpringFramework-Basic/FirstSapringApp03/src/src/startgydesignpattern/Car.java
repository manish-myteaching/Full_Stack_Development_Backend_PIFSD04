package startgydesignpattern;

public class Car {
	private IEngine engine;// DI

	Car() {

	}

	// constructor injection
	Car(IEngine engine) {
		this.engine = engine;
	}

	// setter injection
	public void setEngine(IEngine engine) {
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
