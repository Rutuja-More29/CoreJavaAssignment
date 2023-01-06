package collections;

import java.util.ArrayList;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("January");
		al.add("Febuary");
		al.add("March");
		al.add("April");
		al.add("May");
		al.add("June");
		al.add("July");
		al.add("August");
		al.add("September");
		al.add("Octomber");
		al.add("November");
		al.add("December");
		
		for(String s:al)
		{
			if(al.contains("e"))
			{
				System.out.println(s+" "+s.length());
			}
		}
			

	}

}
