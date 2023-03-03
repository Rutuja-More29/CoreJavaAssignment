package mappractice;

import java.util.HashMap;
import java.util.Map;

public class RemoveEnteryDivisible3 {
	void setmap(HashMap<Integer,String>hm) {
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		hm.put(6, "six");
		hm.put(7, "seven");
		hm.put(8, "eigth");
		hm.put(9, "nine");
		hm.put(10, "ten");
		
		for(Map.Entry<Integer, String> ent:hm.entrySet()) {
			if(ent.getKey()%3!=0) {
				System.out.println(ent);
			}
		}
	}

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		RemoveEnteryDivisible3 r=new RemoveEnteryDivisible3();
		r.setmap(hm);

	}

}
