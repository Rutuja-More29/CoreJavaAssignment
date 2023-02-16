package writtencollection;
import java.util.HashMap;
import java.util.Map;
public class Party {
	void create(HashMap<String,String>hm)
	{
		hm.put("789065432", "bjp");
		hm.put("678954321", "congress");
		hm.put("456789432", "shivsena");
		hm.put("532167890", "shivsena");
	}
	void setlist(HashMap<String,String>hm,HashMap<String,Integer>hmap)
	{
		for(Map.Entry<String, String> s:hm.entrySet())
		{
			String party=s.getValue();
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
		Party p=new Party();
		p.create(hm);
		p.setlist(hm, hmap);
		System.out.println(hmap);

	}

}
