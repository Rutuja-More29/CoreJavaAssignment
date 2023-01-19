package writtencomparatorhashmap;
import java.util.ArrayList;
import java.util.HashMap;
public class NumberSortMap {
	void creatMap(ArrayList<Integer>list,HashMap<String,Integer>hmap)
	{
		for(Integer i:list)
		{
			String name=" ";
			switch(i) {
			case 1:
				name="one";
				break;
			case 2:
				name="two";
				break;
			case 3:
				name="three";
				break;
			case 4:
				name="four";
				break;
				
			}
			if(hmap.containsKey(name))
			{
				int x=hmap.get(name);
				hmap.put(name, x+1);
			}
			else
			{
				hmap.put(name, 1);
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(1);
		al.add(4);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(1);
		al.add(4);
		
		System.out.println(al);
		HashMap<String,Integer>hm=new HashMap<>();
		NumberSortMap nm=new NumberSortMap();
		nm.creatMap(al, hm);
		System.out.println(hm);

	}

}
