package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ContainsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("peeek");
		al.add("seek");
		al.add("beak");
		al.add("veer");
		al.add("tree");
		System.out.print(al);
		System.out.println();
		
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			if(s.contains("ee"))
			{
				System.out.println(s);
			}
		}

	}

}
