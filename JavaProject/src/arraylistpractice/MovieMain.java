package arraylistpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieMain {
	void setArrayList(ArrayList<Movie>al)
	{
		List<String> ac1= new ArrayList<>();
		List<String>ac2=new ArrayList<>();
		List<String>ac3=new ArrayList<>();
		ac1.add("amitabh");
		ac1.add("abhishek");
		ac1.add("aishwarya");
		
		ac2.add("gavinda");
		ac2.add("akshay");
		ac2.add("karina");
		
		ac3.add("varun");
		ac3.add("siddhart");
		ac3.add("aliya");
		
		Movie m1=new Movie();
		m1.setMid(112);
		m1.setMname("bulbullaya");
		m1.setActor(ac1);
		al.add(m1);
		
		Movie m2=new Movie();
		m2.setMid(345);
		m2.setMname("dhamal");
		m2.setActor(ac2);
		al.add(m2);
		
		Movie m3=new Movie();
		m3.setMid(567);
		m3.setMname("om shanto om");
		m3.setActor(ac1);
		al.add(m3);
		
		Movie m4=new Movie();
		
			m4.setMid(897);
			m4.setMname("abcd");
			m4.setActor(ac3);
			al.add(m4);
			
		
		
	}
	void check(ArrayList<Movie>al)
	{
	for(Movie mo:al)
	{
		if(mo.getActor().contains("amitabh"))
		{
			System.out.println(mo.getMname());
		}
	}
		

		
	}

	public static void main(String[] args) {
		ArrayList<Movie>al=new ArrayList<>();
		MovieMain mm=new MovieMain();
		mm.setArrayList(al);
		mm.check(al);
		

	}

}
