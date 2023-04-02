package practicearraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class OddNumber {
	void check(ArrayList<Integer>al) {
		for(int i=0;i<10;i++) {
			al.add(i);
		}
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		OddNumber o=new OddNumber();
		o.check(al);

	}

}
