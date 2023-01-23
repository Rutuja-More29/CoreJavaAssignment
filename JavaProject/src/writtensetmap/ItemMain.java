package writtensetmap;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemMain {
	void setArraylist(ArrayList<Item>al)
	{
		Item it1=new Item();
		Item it2=new Item();
		Item it3=new Item();
		it1.setId(11);
		it1.setName("parleG");
		it1.setPrice(10);
		it1.setQty(5);
		al.add(it1);
		
		it2.setId(1);
		it2.setName("parleG");
		it2.setPrice(10);
		it2.setQty(3);
		al.add(it2);
		
		it3.setId(13);
		it3.setName("gooday");
		it3.setPrice(10);
		it3.setQty(5);
		al.add(it3);
		
		
	}
	void createMap(ArrayList<Item>al,HashMap<String,Integer>hm)
	{
		for(Item i:al)
		{
			String s=i.getName();
			Integer x=i.getQty();
			x=x+1;
			if(hm.containsKey(s))
			{
				hm.put(s, x);
			}
			else
			{
				hm.put(s, 1);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Item>al=new ArrayList<>();
		HashMap<String, Integer>hm=new HashMap<>();
		ItemMain im=new ItemMain();
		im.setArraylist(al);
		im.createMap(al, hm);
		System.out.println(hm);
		

	}

}
