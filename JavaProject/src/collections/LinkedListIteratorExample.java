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
			System.out.println(itl.next());
		}
		System.out.println("----------forward direction--------");
		ListIterator<String>stl=ll.listIterator();
		while(stl.hasNext())
		{
			System.out.println(stl.next());
		}
		System.out.println("------backward direction-------");
		ListIterator<String>itrl=ll.listIterator(ll.size());
		while(itrl.hasPrevious())
		{
			System.out.println(itrl.previous());
		}

	}

}
