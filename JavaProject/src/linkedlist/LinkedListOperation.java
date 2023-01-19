package linkedlist;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListOperation {

	public static void main(String[] args) {
		LinkedList<String>ll=new LinkedList<>();
		ll.add("mon");
		ll.add("tues");
		ll.add("wed");
		ll.add("thur");
		ll.add("fri");
		ll.add("sat");
		ll.add("sun");
		
		System.out.println(ll);
		ll.add(1, "January");
		System.out.println("add first:"+ll);
		
		ll.add(8,"december");
		System.out.println("add last:"+ll);
		
		System.out.println("get first:"+ll.getFirst());
		System.out.println("get last:"+ll.getLast());
	}

}
