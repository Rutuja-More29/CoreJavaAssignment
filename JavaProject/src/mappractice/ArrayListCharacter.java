package mappractice;
import java.util.ArrayList;
import java.util.HashMap;
public class ArrayListCharacter {
	void createArrayList(ArrayList<Character>al)
	{
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('g');
		al.add('b');
		al.add('d');
		al.add('a');
		al.add('b');
		al.add('c');
	}
	void createMap(ArrayList<Character>al,HashMap<Character,Integer>hm)
	{
		for(Character c:al)
		{
			if(hm.containsKey(c))
			{
				int i=hm.get(c);
				i=i+1;
				hm.put(c, i);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		
	}

	public static void main(String[] args) {
	ArrayList<Character> al=new ArrayList<>();
	HashMap<Character,Integer>hm=new HashMap<>();
	ArrayListCharacter ac=new ArrayListCharacter();
	ac.createArrayList(al);
	ac.createMap(al, hm);
	System.out.println(hm);

	}

}
