package mappractice;
import java.util.ArrayList;
import java.util.HashMap;
public class NameSortHashMap {
	void setArrayList(ArrayList<Integer>al)
	{
		al.add(1);
		al.add(4);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(4);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(3);
		
	}
	void creteMap(ArrayList<Integer>al,HashMap<String,Integer>hm)
	{
		for(Integer i:al)
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
			if(hm.containsKey(name))
			{
				int x=hm.get(name);
				hm.put(name, x+1);
			}
			else
			{
				hm.put(name, 1);
			}
		}
	}
	public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<>();
	HashMap<String,Integer>hm=new HashMap<>();
	NameSortHashMap  n=new NameSortHashMap ();
	n.setArrayList(al);
	n.creteMap(al, hm);
	System.out.println(hm);
	

	}

}
