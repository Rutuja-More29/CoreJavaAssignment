package practicearraylist;

import java.util.LinkedList;
import java.util.ListIterator;

public class TraverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(1);
		ll.add(22);
		ll.add(3);
		ll.add(4);
		ll.add(11);
		System.out.println("Traverse by for each loop");
		for(Integer i:ll) {
			System.out.println(i);
		}
		System.out.println(" \n traverse by forward iterator");
		ListIterator<Integer>ltr=ll.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println("\n Traverse by backward iterator ");
		ListIterator<Integer>ltr1=ll.listIterator();
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
	}

}
