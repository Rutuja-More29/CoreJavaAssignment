package writtenarraylist;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(50);
		ll.add(60);
		ll.add(80);
		ListIterator<Integer>itl=ll.listIterator(ll.size());
		while(itl.hasPrevious())
		{
			System.out.print(itl.previous()+" ");
		}

	}

}
