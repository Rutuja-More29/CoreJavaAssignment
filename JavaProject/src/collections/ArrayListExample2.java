package collections;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>ll=new ArrayList<>();
		ll.add(20);
		ll.add(50);
		ll.add(60);
		ll.add(90);
		ll.add(100);
		System.out.println(ll);
		ll.add(120);
		System.out.println(ll);
		//ll.getFirst();
		System.out.println(ll);
		ll.remove(2);
		System.out.println("remove"+ll);
		ll.isEmpty();
		System.out.println(ll);
		//ll.clear();
		//System.out.println(ll.removeLast());
		System.out.println(ll.indexOf(3));
		
		
		
		ArrayList<Integer>list=new ArrayList<>();
		list.add(400);
		list.add(300);
		list.add(200);
		list.add(100);
		list.add(50);
		ll.addAll(list);
		System.out.println("addAll"+ll);
		ll.retainAll(list);
		System.out.println("retain all"+ll);
		ll.set(1, 5);
		System.out.println("set"+ll);
		
		System.out.println(ll.equals(list));
		

	}

}
