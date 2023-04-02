package monthlytest;
//first print odd and then print even
public class ThreadPrintFirst10Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new Runnable() {
			public void run() {
				for(int i=2;i<=10;i+=2) {
					System.out.println(i);
				}
			}
		}
				);
		t.start();
		for(int i=1;i<=9;i+=2) {
			System.out.println(i);
		}

	}

}
