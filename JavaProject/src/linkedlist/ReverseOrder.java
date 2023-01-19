package linkedlist;
import java.util.Collections;
import java.util.LinkedList;
public class ReverseOrder {

	public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<>();
	ll.add("naman");
	ll.add("rit");
	ll.add("swap");
	ll.add("git");
	ll.add("mit");
	System.out.println(ll);
	Collections.sort(ll);
	Collections.reverse(ll);
	System.out.println(ll);

	}

}
