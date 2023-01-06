package arraylistassignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}

	}

}
