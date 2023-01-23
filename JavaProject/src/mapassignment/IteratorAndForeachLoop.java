package mapassignment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class IteratorAndForeachLoop {
	void iterteByForeachLoop(HashMap<Integer,String> hm)
	{
		hm.put(12, "shubham");
		hm.put(16, "harsha");
		hm.put(20, "rita");
		hm.put(90, "kavya");
		System.out.println("---------traverse only key---------");
		for(Integer i:hm.keySet())
		{
			System.out.print(i+" ");
		}
		System.out.println("\n\n-----------traverse key and value using mapentry--------");
		for(Map.Entry<Integer, String> ent: hm.entrySet())
		{
			System.out.println(ent+" ");
		}
	}
	void iterateByIterator(HashMap<Integer,String>hm)
	{
		System.out.println("\n---------traverse by iterator-------");
		Set<Map.Entry<Integer,String>>s=hm.entrySet();
		Iterator<Map.Entry<Integer,String>> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
	}
	

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		IteratorAndForeachLoop it=new IteratorAndForeachLoop();
		it.iterteByForeachLoop(hm);
		it.iterateByIterator(hm);

	}

}
