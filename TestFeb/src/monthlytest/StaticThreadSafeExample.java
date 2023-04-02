package monthlytest;

class ThreadSafeStaticVariable{
	private static int count=0;
	public static synchronized void increment() {
		count++;
	}
	public static synchronized  int getCount() {
		return count;
	}
}
public class StaticThreadSafeExample {

	public static void main(String[] args) {
		Thread t1=new Thread(() ->{
			for(int i=0;i<100;i++) {
				ThreadSafeStaticVariable.increment();
			}
		}
			);
		Thread t2=new Thread(() ->{
			for(int i=0;i<100;i++) {
				ThreadSafeStaticVariable.increment();
			}
		}
				);
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("count:"+ThreadSafeStaticVariable.getCount());
	}

}
