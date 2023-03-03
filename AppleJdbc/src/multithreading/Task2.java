package multithreading;

public class Task2  implements Runnable{

	@Override
	public void run() {
		int count=0;
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+count);
			count++;
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		
	}

}
