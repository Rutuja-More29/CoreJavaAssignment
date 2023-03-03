package multithreading;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationExample {
	static ConcurrentHashMap <Integer,String>hm;
	ConcurrentModificationExample ()
	{
		hm=new ConcurrentHashMap<>();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		
	}
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hm.put(4, "D");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentModificationExample obj=new ConcurrentModificationExample();
		
		Thread t1= new ConcurrentModificationExample();
		
		t1.start();
		
		Iterator itr=hm.entrySet().iterator();
		while(itr.hasNext()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(itr.next());
		}

	}

}
