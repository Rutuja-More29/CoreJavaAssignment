package mappractice;

import java.util.ArrayList;
import java.util.HashMap;
	

public class HashmapExample {
	void createIntegerArrayList(ArrayList<Integer> al)
	{
		
		al.add(10);
		al.add(20);
		al.add(30);
	}
	void createStringArraylist(ArrayList<String>sl) {
		
		sl.add("math");
		sl.add("physics");
		sl.add("chemistry");
		
	}
	void createMap(ArrayList<Integer>al,ArrayList<String>sl,HashMap<Integer,String>hm)
	{
		HashMap<ArrayList<Integer>,ArrayList<String>>hmap=new HashMap<>();
		hmap.put(al, sl);
		System.out.println(hmap);
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		ArrayList<String>sl=new ArrayList<>();
		HashMap<Integer,String>hm=new HashMap<>();
		HashmapExample h=new HashmapExample();
		h.createIntegerArrayList(al);
		h.createStringArraylist(sl);
		System.out.println(al);
		System.out.println(sl);
		h.createMap(al, sl, hm);
		
	}
}
