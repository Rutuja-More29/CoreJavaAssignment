package linkedlist;
import java.util.LinkedList;
public class AddElement {

	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(10);
		ll.add(46);
		ll.add(67);
		ll.add(50);
		ll.add(100);
		ll.add(245);
		System.out.println(ll);
		ll.set(4, 900);
		System.out.println(ll);

	}

}
