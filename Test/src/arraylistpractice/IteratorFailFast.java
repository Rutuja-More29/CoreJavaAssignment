package arraylistpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorFailFast {
	void check(ArrayList<Integer>al) {
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(60);
	Iterator<Integer>itr=al.iterator();
	while(itr.hasNext()) {
		Integer i=itr.next();
		if(i==10) {
			al.add(200);
		}
		
	}
	System.out.println(itr);
	}
	public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<>();
	IteratorFailFast f=new IteratorFailFast();
	f.check(al);

	}

}
