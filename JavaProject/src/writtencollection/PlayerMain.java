package writtencollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class PlayerMain {
	void createList(ArrayList<Player>al)
	{
		al.add(new Player(1,"MS Dhoni","India","CSK"));
		al.add(new Player(2,"Rohit Sharma","India","MI"));
		al.add(new Player(3,"jitesh sharma","india","MI"));
		al.add(new Player(4,"Shubham gill","india","indian national"));
		al.add(new Player(5,"Ben Stokes","England","England team"));
		
	
		
	}
	void display(ArrayList<Player>al,HashMap<String,Integer>hm)
	{
		for(Player p:al)
		{
			String team=p.team;
			String country=p.country;
			int i=hm.get(team);
			if(country.equalsIgnoreCase("india"))
			{
				hm.put(country, i+1);
			}
			else
			{
				hm.put(team, 1);
			}
		}
		Iterator<Map.Entry<String,Integer>>itr=hm.entrySet().iterator();
		int max=0;
		int min=0;
		while(itr.hasNext())
		{
			min=itr.next().getValue();
			if(max<min)
			{
				max=min;
			}
		}
		System.out.println(max);
		for(Map.Entry<String, Integer>itr1:hm.entrySet()) {
			if(itr1.getValue()==max)
			{
				System.out.println(itr1.getKey()+" "+itr1.getValue());
			}
		}
	}
	

	public static void main(String[] args) {
		ArrayList<Player>al=new ArrayList<>();
		HashMap<String,Integer>hm=new HashMap<>();
		PlayerMain pm=new PlayerMain();
		pm.createList(al);
		pm.display(al, hm);
	//	System.out.println(hm);
		

	}

}
