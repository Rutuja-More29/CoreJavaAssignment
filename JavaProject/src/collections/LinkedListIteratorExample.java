package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>ll=new LinkedList<>();
		ll.add("Kanchan");
		ll.add("himanshu");
		ll.add("Rachit");
		ll.add("Abhitnya");
		
		Iterator<String>itl=ll.iterator();
		while(itl.hasNext())
		{
			System.out.print(itl.next()+" ");
		}
		System.out.println("\n\n----------forward direction--------");
		ListIterator<String>stl=ll.listIterator();
		while(stl.hasNext())
		{
			System.out.print(stl.next()+" ");
		}
		System.out.println("\n\n------backward direction-------");
		ListIterator<String>itrl=ll.listIterator(ll.size());
		while(itrl.hasPrevious())
		{
			System.out.print(itrl.previous()+" ");
		}

	}

}
