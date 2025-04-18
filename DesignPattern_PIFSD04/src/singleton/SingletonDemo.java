package singleton;

public class SingletonDemo implements Cloneable {

	static SingletonDemo INSTANCE;

	private SingletonDemo() {
	}

	public static synchronized SingletonDemo getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonDemo();
		}
		return INSTANCE;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone is not supported");
	}

	public void m1() {

	}

}
