package map;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListCharacterExample {

	public static void main(String[] args) {
		ArrayList<Character> al=new ArrayList<>();
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('a');
		al.add('b');
		al.add('d');
		al.add('a');
		al.add('e');
		al.add('c');
		HashMap<Character,Integer> hm=new HashMap<>();
		for(Character c:al)
		{
			if(hm.containsKey(c))
			{
				int i=hm.get(c);
				i=i+1;
				hm.put(c, i);  //use replace
			}
			else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
	}

}
