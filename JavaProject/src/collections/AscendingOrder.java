package collections;

import java.util.Collections;
import java.util.LinkedList;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(400);
		ll.add(600);
		ll.add(800);
		ll.add(100);
		ll.add(20);
		
		Collections.sort(ll);   
		System.out.println(ll);

	}

}
