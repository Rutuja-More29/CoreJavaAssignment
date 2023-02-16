package set;

import java.util.HashSet;

public class ConvertSetToArray {

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<>();
		hs.add("apple");
		hs.add("mango");
		hs.add("waterlemon");
		hs.add("grapes");
		hs.add("straberry");
		System.out.println(hs);
		String s[]=new String[hs.size()];
		hs.toArray(s);
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}

	}

}
