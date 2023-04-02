package mappractice;
import java.util.ArrayList;
import java.util.HashMap;
public class ItemMain {
	void createArrayList(ArrayList<Item>al)
	{
		al.add(new Item(11,"goodday",10,5));
		al.add(new Item(15,"parleG",20,2));
		al.add(new Item(3,"parleG",10,6));
		al.add(new Item(5,"goodday",5,50));
	}
	void createMap(ArrayList<Item>al,HashMap<String,Integer>hm)
	{
		for(Item it:al)
		{
			String s=it.name;
			int i=it.qnty;
			i=i+1;
			
			if(hm.containsKey(s))
			{
				hm.put(s,i );
			}
			else
			{
				hm.put(s, 1);
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Item>al=new ArrayList<>();
		HashMap<String,Integer>hm=new HashMap<>();
		ItemMain im=new ItemMain();
		im.createArrayList(al);
		im.createMap(al, hm);
		System.out.println(hm);
		

	}

}
