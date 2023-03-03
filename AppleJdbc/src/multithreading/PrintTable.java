package multithreading;

public class PrintTable {

	void table(int n) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("1-> 1-10");
		System.out.println("1-> 11-20");
		System.out.println("1-> 21-30");
		System.out.println("1-> 31-40");
	

	synchronized (PrintTable.class) {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println(n * i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * synchronized void table(int n) {
	 * System.out.println(Thread.currentThread().getName()); for(int i=0;i<10;i++) {
	 * System.out.println(n*i); } try { Thread.sleep(1000); } catch
	 * (InterruptedException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }*/
	 
}


class MyThread1 extends Thread {
	PrintTable t;

	MyThread1(PrintTable t) {
		this.t = t;
	}

	public void run() {
		t.table(5);
	}
}

class MyThread2 extends Thread {
	PrintTable t;

	MyThread2(PrintTable t) {
		this.t = t;
	}

	public void run() {
		t.table(10);
	}
}
}
