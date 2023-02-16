package collectionpractice;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class FailSafeIterator {

	public static void main(String[] args) {
	CopyOnWriteArrayList<Integer> cal=new CopyOnWriteArrayList<>();
		cal.add(100);
		cal.add(200);
		cal.add(300);
		cal.add(400);
		cal.add(500);
		cal.add(600);
		
		Iterator<Integer> itr=cal.iterator();
		while(itr.hasNext())
		{
			if(itr.next()==200)
				cal.add(30);
		}
		System.out.println(cal);
	}

}
