package collections;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
public class FailSafeIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<Integer> cal=new CopyOnWriteArrayList<>();
		cal.add(10);
		cal.add(20);
		cal.add(30);
		cal.add(40);
		cal.add(50);
		cal.add(60);
		cal.add(70);
		cal.add(80);
		cal.add(90);
		
		Iterator<Integer> itr=cal.iterator();
		while(itr.hasNext())
		{
			if(itr.next()==10)
			{
				cal.add(100);
			}
		}
		System.out.println(cal);
	}

}
