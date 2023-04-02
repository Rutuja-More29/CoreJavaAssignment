package practicearraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ElementForeachloopIterator {
	void check(ArrayList<Integer>al) {
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		
		for(Integer i:al) {
			System.out.print(i+" ");
		}
		System.out.println("\n---------------------------Iterator ------------------");
		
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		ElementForeachloopIterator efl=new ElementForeachloopIterator();
		efl.check(al);

	}

}
