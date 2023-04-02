package practicearraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumber {
	void check(ArrayList<Integer>al) {
		for(int i=1;i<20;i++) {
			al.add(i);
		}
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext()) {
			Integer num=itr.next();
			if(num%2==0) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		EvenNumber e=new EvenNumber();
		e.check(al);
		

	}

}
