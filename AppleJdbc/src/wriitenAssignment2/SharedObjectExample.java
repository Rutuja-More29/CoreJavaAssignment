package wriitenAssignment2;

public class SharedObjectExample {
	public static void main(String[] args) {
		// create a shared object
		MySharedObject sharedObject = new MySharedObject();

		// create two threads that access the shared object
		Thread thread1 = new Thread(new MyRunnable(sharedObject));
		Thread thread2 = new Thread(new MyRunnable(sharedObject));

		// start the threads
		thread1.start();
		thread2.start();
	}
}

class MySharedObject {
	private int counter = 0;

	public void increment() {
		synchronized (this) {
			counter++;
			System.out.println("Counter value: " + counter);
		}
	}
}

class MyRunnable implements Runnable {
	private MySharedObject sharedObject;

	public MyRunnable(MySharedObject sharedObject) {
		this.sharedObject = sharedObject;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			sharedObject.increment();
		}
	}
}
