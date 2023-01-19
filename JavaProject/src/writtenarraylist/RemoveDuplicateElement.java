package writtenarraylist;

import java.util.ArrayList;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Sat");
		al.add("Mon");
		ArrayList<String> al1=new ArrayList<>();
		for(String s:al)
		{
			if(!al1.contains(s))
			{
				al1.add(s);
			}
			
		}
		System.out.println(al1);	
	}

}
