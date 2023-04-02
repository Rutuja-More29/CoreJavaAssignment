package monthlytest;

public class MyThread extends Thread{
	MyThread(){
		System.out.println("MyThread");
	}
	public void run() {
		System.out.println("bar");
	}
}
class main{
	public static void main(String[] args) {
		Thread t=new MyThread() {
			public void run() {
				System.out.println("foo");
			}
		};
		t.start();
	}
}
