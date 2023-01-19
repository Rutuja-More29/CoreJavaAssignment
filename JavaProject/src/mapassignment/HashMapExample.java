package mapassignment;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;
public class HashMapExample {
	void createMap(HashMap<String,Integer>hmap)
	{
		hmap.put("java", 8);
		hmap.put("python", 5);
		hmap.put("c", 2);
		hmap.put("c++", 3);
		hmap.put("dotnet", 6);
	}
	void sort(HashMap<String,Integer>hmap)
	{
		for(String s:hmap.keySet())
		{
			System.out.print(s+" ");
			
		}
		
		for(Integer i:hmap.values())
		{
			
			System.out.print("\n"+i+" ");
			
		}
		
		for(Map.Entry<String, Integer> ent: hmap.entrySet())
		{
			System.out.println(ent+" ");
		}
	}
	void sortIterator(HashMap<String,Integer>hmap)
	{
		Set<Map.Entry<String,Integer>> s=hmap.entrySet();
		Iterator<Map.Entry<String, Integer>> itr=s.iterator();
	}
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		HashMapExample hme=new HashMapExample();
		hme.createMap(hm);
		hme.sort(hm);
		hme.sortIterator(hm);
		System.out.println("sort by iterator:"+hm);
	}

}
