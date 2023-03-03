package multithreading;

public class RunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task2 obj1=new Task2();
		//Task2 obj2=new Task2();
		//Thread t1=new Thread(obj1,"A");
		//Thread t2=new Thread(obj2,"B");
		
		Thread t1=new Thread(obj1,"A");
		Thread t2=new Thread(obj1,"B");
		Thread t3=new Thread(obj1,"C");
		
		//t1.start();
		
	/*	try {
			t1.join(); //current thread execute first
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.getState());
		t2.start(); */
		
		t1.start();
		t1.yield();  // allow other thread to execute first
		t2.start();
		t3.start();
	}

}
