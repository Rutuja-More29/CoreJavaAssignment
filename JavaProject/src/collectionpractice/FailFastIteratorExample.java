package collectionpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIteratorExample {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext())
		{
		Integer i=itr.next();
		if(i==10)
		al.add(2);
			
		
			
		}
		System.out.println(al);

	}

}
