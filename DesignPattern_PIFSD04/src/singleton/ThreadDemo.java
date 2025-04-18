package singleton;

public class ThreadDemo implements Runnable {

	@Override
	public void run() {
		SingletonDemo test = SingletonDemo.getInstance();
		System.out.println(test.hashCode() +" ====>"+Thread.currentThread().getName());
	}

}
