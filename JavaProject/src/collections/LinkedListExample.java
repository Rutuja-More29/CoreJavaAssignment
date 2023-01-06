package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<>();
		ll.add("January");
		ll.add("Febuary");
		ll.add("March");
		ll.add("April");
		ll.add("May");
		ll.add("June");
		ll.add("July");
		ll.add("August");
		ll.add("September");
		ll.add("October");
		ll.add("November");
		ll.add("December");
		
		for(String s:ll)
		{
			System.out.println(s);
		}
	

	}

}
