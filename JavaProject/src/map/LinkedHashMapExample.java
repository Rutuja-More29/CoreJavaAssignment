package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(19, "raghav");
		hm.put(50, "tina");
		hm.put(80, "gaurav");
		hm.put(14, "sakshi");
		hm.put(1, "savi");
		System.out.println("hashmap:"+hm);
		
		
		
		
		LinkedHashMap<Integer ,String> lhm=new LinkedHashMap<>();
		lhm.put(19, "raghav");
		lhm.put(50, "tina");
		lhm.put(80, "gaurav");
		lhm.put(14, "sakshi");
		lhm.put(1, "savi");
		System.out.println("linkedhashmap:"+lhm);
		
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(19, "raghav");
		tm.put(50, "tina");
		tm.put(80, "gaurav");
		tm.put(14, "sakshi");
		tm.put(1, "savi");
		System.out.println("treemap:"+tm);

	}

}
