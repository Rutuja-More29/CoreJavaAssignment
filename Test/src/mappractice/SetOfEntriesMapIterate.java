package mappractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SetOfEntriesMapIterate {
	void createMap(HashMap<Integer,String>hm) {
		hm.put(1,"one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		
		System.out.println("--------------------iterate by for each loop--------------------");
		for(Map.Entry<Integer, String>ent:hm.entrySet()) {
			System.out.println(ent);
		}
		System.out.println("-----------iterate by iterator----------------------");
		Set<Map.Entry<Integer,String>>s=hm.entrySet();
		Iterator<Map.Entry<Integer,String>>itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		 SetOfEntriesMapIterate obj=new  SetOfEntriesMapIterate();
		 obj.createMap(hm);
		 

	}

}
