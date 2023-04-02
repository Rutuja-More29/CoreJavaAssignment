package mappractice;

import java.util.ArrayList;
import java.util.HashMap;

public class CityFreq {
	void createArrayList(ArrayList<String>al) {
		al.add("pune");
		al.add("mumbai");
		al.add("pune");
		al.add("mumbai");
		al.add("nashik");
		al.add("pune");
	}
	void setMap(HashMap<String,Integer>hm,ArrayList<String>al) {
		for(String s:al) {
			if(hm.containsKey(s)) {
			int i=hm.get(s);
			i=i+1;
			hm.put(s, i);
		}else
		{
			hm.put(s, 1);
		}
			System.out.println(s);
		}
		
	}
	
	public static void main(String[] args) {
	ArrayList<String>al=new ArrayList<>();
	HashMap<String,Integer>hm=new HashMap<>();
	CityFreq c=new CityFreq();
	c.createArrayList(al);
	c.setMap(hm, al);
}
}
