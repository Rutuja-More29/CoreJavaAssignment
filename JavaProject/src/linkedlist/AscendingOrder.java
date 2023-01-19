package linkedlist;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
public class AscendingOrder {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(34);
		ll.add(90);
		ll.add(123);
		ll.add(100);
		ll.add(600);
		ll.add(200);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println("ascending order:"+ll);

	}

}
