package map;

import java.util.ArrayList;
import java.util.HashMap;

public class CharcterForLoop {

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
		for(int i=0;i<al.size();i++)
		{
			char c=al.get(i);
			int cnt=1;
			for(int j=i+1;j<al.size();j++)
			{
				if(c==al.get(j));
				{
					cnt++;
					al.set(j, '\0');
					
				}
			}
			if(c!='\0')
			{
				System.out.println(c+" "+cnt);
			}
			
		}
		System.out.print(hm);
	}

}
