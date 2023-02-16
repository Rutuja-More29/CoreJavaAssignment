package collectionpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class MovieMain {
	void setArrayList(ArrayList<Movie>al)
	{
		ArrayList<String>actor1=new ArrayList<>();
	    ArrayList<String>actor2=new ArrayList<>();
	    actor1.add("amitabh");
	    actor2.add("ranbir");
	    
	    Movie m1=new Movie();
	    m1.setMid(11);
	    m1.setMname("brahmstra");
	    m1.setAct(actor1);
	    al.add(m1);
	    
	    Movie m2=new Movie();
	    m2.setMid(22);
	    m2.setMname("avtar");
	    m2.setAct(actor2);
		
	    Movie m3=new Movie();
	    m3.setMid(33);
	    m3.setMname("abcd");
	    m3.setAct(actor1);
	}
	void removeElement(ArrayList<Movie>al)
	{
		Iterator<Movie> itr=al.iterator();
		while(itr.hasNext())
		{
			Movie mo=itr.next();
		for(String s:mo.act)
		{
			if(s.contains("amitabh"))
			{
				itr.remove();
			}
		}
		}
		System.out.println(al);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> al=new ArrayList<>();
		MovieMain mm=new MovieMain();
		mm.setArrayList(al);
		mm.removeElement(al);
		

	}

}
