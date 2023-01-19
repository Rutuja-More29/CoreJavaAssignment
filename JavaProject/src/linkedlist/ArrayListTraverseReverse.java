package linkedlist;
import java.util.LinkedList;
import java.util.ListIterator;
public class ArrayListTraverseReverse {

	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(100);
		ll.add(300);
		ll.add(600);
		ll.add(90);
		ll.add(10);
		System.out.println(ll);
		ListIterator<Integer> itr=ll.listIterator(ll.size());
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous()+" ");
		}
	}

}
