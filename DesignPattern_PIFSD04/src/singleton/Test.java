package singleton;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
//		SingletonDemo test =SingletonDemo.getInstance();
//		System.out.println(test.hashCode());
//
//		SingletonDemo test1 = SingletonDemo.getInstance();
//		System.out.println(test1.hashCode());
//
//		SingletonDemo test3 = SingletonDemo.getInstance();
//		System.out.println(test3.hashCode());
//
//		SingletonDemo test4 = SingletonDemo.getInstance();
//		System.out.println(test4.hashCode());

		Thread thread = new Thread(new ThreadDemo());
		thread.start();

		Thread thread2 = new Thread(new ThreadDemo());
		thread2.start();

		Thread thread3 = new Thread(new ThreadDemo());
		thread3.start();

		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				SingletonDemo test = SingletonDemo.getInstance();
				System.out.println(test.hashCode() + " ====>" + Thread.currentThread().getName());
			}
		});
		thread4.start();

		SingletonDemo sd = SingletonDemo.getInstance();
		SingletonDemo cloneSD=(SingletonDemo)sd.clone();
		System.out.println(cloneSD.hashCode());
		
	}
}
