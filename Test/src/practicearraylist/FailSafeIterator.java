package practicearraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer>al=new CopyOnWriteArrayList<>();
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext()) {
			if(itr.next()==15) {
				al.add(18);
			}
		}
		System.out.println(al);
	}

}
