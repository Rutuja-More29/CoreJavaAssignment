package arraylistpractice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListReverse {
	void setlinkedlist(LinkedList<Integer>ll)
	{
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		Iterator<Integer>itrl=ll.descendingIterator(); // use iterator
		while(itrl.hasNext())
		{
			System.out.print(itrl.next()+" ");
		}
		System.out.println();
		ListIterator<Integer>itr=ll.listIterator(ll.size());  // use listiterator
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous()+" ");
		}
	}
	public static void main(String[] args) {
		LinkedList<Integer> ll= new LinkedList<>();
		LinkedListReverse lr=new LinkedListReverse();
		lr.setlinkedlist(ll);
		
		

	}

}
