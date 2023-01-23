package mappractice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class IteratorMapKeyValue {
	void createMap(HashMap<Integer,String>hm)
	{
		hm.put(1,"pink");
		hm.put(2, "black");
		hm.put(3, "red");
		hm.put(8, "black");
		hm.put(10, "grey");
		hm.put(16, "orange");
		
		for(Integer i:hm.keySet())
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(String s:hm.values())
		{
			System.out.print(s+" ");
		}
		System.out.println();
		Set<Map.Entry<Integer,String>> s=hm.entrySet();
		Iterator<Map.Entry<Integer, String>> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		for(Map.Entry<Integer, String> ms:hm.entrySet())
		{
			System.out.println(ms);
		}
	}

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		IteratorMapKeyValue imkv=new IteratorMapKeyValue();
		imkv.createMap(hm);

	}

}
