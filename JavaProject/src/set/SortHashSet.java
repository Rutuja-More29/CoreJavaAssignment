package set;

import java.util.HashSet;
import java.util.Iterator;

public class SortHashSet {

	public static void main(String[] args) {
		HashSet<Integer>hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(5);
		hs.add(4);
		hs.add(6);
		for(Integer i:hs)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n-----------using itrator----------");
		Iterator<Integer>itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
