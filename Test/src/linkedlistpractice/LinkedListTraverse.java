package linkedlistpractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTraverse {

	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(20);
		ll.add(10);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(100);
		for(Integer i:ll) {
			System.out.print(i+" ");
		}
		System.out.println("\n............iterator..........");
		ListIterator<Integer>itr=ll.listIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println("\n............previous iterator.........");
		ListIterator<Integer>itrl=ll.listIterator(ll.size());
		while(itr.hasPrevious()) {
			System.out.print(itr.previous()+" ");
		}
		System.out.println("\n............descending iterator..........");
		Iterator<Integer>itll=ll.descendingIterator();
		while(itll.hasNext()) {
			System.out.print(itll.next()+" ");
		}
	}

}
