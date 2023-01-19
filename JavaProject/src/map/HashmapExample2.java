package map;

import java.util.HashMap;

public class HashmapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(19, "raghav");
		hm.put(50, "tina");
		hm.put(80, "gaurav");
		hm.put(14, "sakshi");
		hm.put(1, "savi");
		System.out.println("hashmap:"+hm);
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("tina"));
		System.out.println(hm.get(19));
		System.out.println(hm.getOrDefault(12, "kavya"));
		System.out.println(hm.remove(80));
		//System.out.println(hm.replace(19, "rita"));
	}

}
