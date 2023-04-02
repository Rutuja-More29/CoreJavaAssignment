package mappractice;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemMain {
	void createList(ArrayList<Item>al) {
		al.add(new Item(11,"goodday",15,5));
		al.add(new Item(122,"parleG",20,15));
		al.add(new Item(23,"burbon",35,20));
		al.add(new Item(25,"parleG",50,90));
		
	}
	void createMap(ArrayList<Item>al,HashMap<String,Integer>hm) {
		for(Item it:al) {
			String s=it.name;
			int i=it.qty;
			i=i+1;
			if(hm.containsKey(s)) {
				hm.put(s, i);
			}else
			{
				hm.put(s, 1);
			}
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Item>al=new ArrayList<>();
		HashMap<String,Integer>hm=new HashMap<>();
		ItemMain itm=new ItemMain();
		itm.createList(al);
		itm.createMap(al, hm);
		

	}

}
