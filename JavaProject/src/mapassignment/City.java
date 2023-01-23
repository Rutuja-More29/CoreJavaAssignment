package mapassignment;

import java.util.ArrayList;
import java.util.HashMap;

public class City {
	void setArrayList(ArrayList<String>al)
	{
		al.add("pune");
		al.add("mumbai");
		al.add("pune");
		al.add("mumbai");
		al.add("mumbai");
		HashMap<String,Integer>hm=new HashMap<>();
		for(String s:al)
		{
			if(hm.containsKey(s)) {
			int i=hm.get(s);
			i=i+1;
			hm.put(s, i);
		}
		else
		{
			hm.put(s, 1);
		}
			
		}
		System.out.println(hm);
	}
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		City c=new City();
		c.setArrayList(al);
		
		

	}

}
