package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(400);
		ll.add(600);
		ll.add(800);
		ll.add(100);
		ll.add(20);
		
		int cnt=0;
		Iterator<Integer> it=ll.iterator();
		while(it.hasNext())
		{
			if(it.next()==800)
			{
				cnt++;
			}
		}
		System.out.print(cnt);

	}

}
