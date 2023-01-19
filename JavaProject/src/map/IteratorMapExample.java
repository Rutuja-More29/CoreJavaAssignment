package map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class IteratorMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(101,"rita");
		hm.put(45, "shweta");
		hm.put(30, "kavya");
		hm.put(23, "ash");
		hm.put(12, "gita");
		hm.put(46, "nita");
		hm.put(79, "lata");
		
		System.out.println(hm);
		System.out.println("---------------traversing only key--------------");
		for(Integer i:hm.keySet())
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n\n-------------traversing only values--------------");
		for(String s:hm.values())
		{
			System.out.print(s+" ");
		}
		
		System.out.println("\n\n-------------traversing using map entry----------");
		for(Map.Entry<Integer, String> ent:hm.entrySet() )
		{
			System.out.print(ent+" ");
		}
		System.out.println("\n\n-------------traversing using iterator-----------");
		Set<Map.Entry<Integer,String>> s=hm.entrySet();
		Iterator<Map.Entry<Integer,String>> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
