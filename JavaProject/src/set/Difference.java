package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Difference {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(5);
		hs.add(4);
		hs.add(6);
		System.out.println(hs);
		
		LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
		
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(5);
		lhs.add(4);
		lhs.add(6);
		System.out.println(lhs);
		
		TreeSet<Integer>ths=new TreeSet<>();
		ths.add(10);
		ths.add(20);
		ths.add(30);
		ths.add(5);
		ths.add(4);
		ths.add(6);
		
		System.out.println(ths);

	}

}
