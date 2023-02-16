package writtensetmap;

import java.util.HashMap;
import java.util.Map;

public class MapExampleMain {
	void createMap(HashMap<String,String> hm)
	{
		hm.put("4567890", "bjp");
		hm.put("5678432", "ncp");
		hm.put("8899890", "bjp");
		hm.put("665558432", "shivsena");
		hm.put("111237890", "congress");
		hm.put("7754432", "shivsena");
	}
	void createhasmap(HashMap<String,String>hm,HashMap<String,Integer>hmap )
	{
		for(Map.Entry<String, String> ent:hm.entrySet())
		{
			String party=ent.getValue();
			
			if(hmap.containsKey(party))
			{
				hmap.put(party, hmap.get(party)+1);
			}
			else
			{
				hmap.put(party, 1);
			}
		}
	}

	public static void main(String[] args) {
		HashMap<String,String>hm=new HashMap<>();
		HashMap<String,Integer>hmap=new HashMap<>();
		MapExampleMain m=new MapExampleMain();
		m.createMap(hm);
		m.createhasmap(hm, hmap);
		System.out.println(hmap);
		
		

	}

}
