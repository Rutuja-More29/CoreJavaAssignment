package linkedlist;
import java.util.LinkedList;
import java.util.Iterator;
public class DesecndingIterator {

	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(1000);
		ll.add(9000);
		ll.add(7000);
		ll.add(150);
		ll.add(9);
		System.out.println(ll);
		Iterator<Integer>itr=ll.descendingIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}

	}

}
