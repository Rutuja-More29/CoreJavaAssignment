package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		System.out.println("------Iterator------");
		Iterator<Integer>ali=al.iterator();
		while(ali.hasNext())
		{
			System.out.print(ali.next()+" ");
		}
		System.out.println("\n------ListIterator forward direction------");
		ListIterator<Integer>lit=al.listIterator();
		while(lit.hasNext())
		{
			System.out.print(lit.next()+" ");
		}
		System.out.println("\n\n------ListIterator backword direction------");
		ListIterator<Integer>blit=al.listIterator(al.size());
		while(blit.hasPrevious())
		{
			System.out.print(blit.previous()+" ");
		}

	}

}
