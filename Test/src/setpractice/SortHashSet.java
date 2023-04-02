package setpractice;

import java.util.HashSet;
import java.util.Iterator;

public class SortHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>hs=new HashSet<>();
		hs.add(1);
		hs.add(12);
		hs.add(2);
		hs.add(15);
		hs.add(3);
		hs.add(23);
		
		for(Integer i:hs) {
			System.out.print(i+" ");
		}
		System.out.println();
		Iterator<Integer>itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}

}
