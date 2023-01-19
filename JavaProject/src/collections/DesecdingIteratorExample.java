package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class DesecdingIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(5);
		ll.add(4);
		ll.add(6);
		ll.add(1);
		ll.add(2);
		System.out.print(ll+" ");
		
		ll.addFirst(7);
		System.out.println(ll);
		
		ll.addLast(8);
		System.out.print(ll+" ");
		System.out.println();
		
		Iterator<Integer>itr=ll.descendingIterator();   //Linkedlist
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
	

	
	}

}
