package mappractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorAndForeachLoppMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(1, "one");
		hm.put(22, "twentytwo");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		System.out.println("--------iterate through kay-------");
		for(Integer i:hm.keySet()) {
			System.out.print(i+" ");
		}
		System.out.println("\n---------iterate through values---------");
		for(String s:hm.values()) {
			System.out.print(s+" ");
		}
		System.out.println("\n-----------iterate through throug map-----------");
		for(Map.Entry<Integer, String>ent:hm.entrySet()) {
			System.out.print(ent+" ");
		}
		System.out.println("\n----------itrate by iterator-------------");
		Set<Map.Entry<Integer,String>> s=hm.entrySet();
		Iterator<Map.Entry<Integer,String>> ent=s.iterator();
		while(ent.hasNext()) {
			System.out.print(ent.next()+" ");
		}
	}

}
