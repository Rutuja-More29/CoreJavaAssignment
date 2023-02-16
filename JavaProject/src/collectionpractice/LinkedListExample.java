package collectionpractice;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		for(Integer i:ll)
		{
			System.out.println(ll);
		}
		
		ListIterator<Integer>itrl=ll.listIterator();
		while(itrl.hasNext())
		{
			System.out.print(itrl.next()+" ");
		}
		System.out.println();
		
		ListIterator<Integer>itrll=ll.listIterator(ll.size());
		while(itrll.hasPrevious())
		{
			System.out.print(itrll.previous()+" ");
		}
		System.out.println();
		
		Iterator<Integer>itr=ll.descendingIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
