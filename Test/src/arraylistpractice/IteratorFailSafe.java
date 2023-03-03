package arraylistpractice;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorFailSafe {
	void create(CopyOnWriteArrayList<Integer>cal) {
		cal.add(100);
		cal.add(200);
		cal.add(300);
		cal.add(400);
		cal.add(500);
		cal.add(600);
		Iterator<Integer>itr=cal.iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			if(i==500) {
				cal.add(900);
			}
		}
		System.out.println(cal);
	}

	public static void main(String[] args) {
	CopyOnWriteArrayList<Integer>cal=new CopyOnWriteArrayList<>();
	IteratorFailSafe f=new IteratorFailSafe();
	f.create(cal);

	}

}
