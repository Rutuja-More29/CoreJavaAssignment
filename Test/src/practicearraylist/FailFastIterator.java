package practicearraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {
	void check(ArrayList<Integer>al) {
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(6);
		
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			if(i==6) {
				al.add(10);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<Integer>();
		FailFastIterator ff=new FailFastIterator();
		ff.check(al);

	}

}
