package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class TheaterMovie1Main {
	

	public static void main(String[] args) {
		ArrayList<Theater> at=new ArrayList<>();
		
		
		ArrayList<Movie1> m1=new ArrayList<>();
		ArrayList<Movie1> m2=new ArrayList<>();
		ArrayList<Movie1> m3=new ArrayList<>();
		ArrayList<Movie1> m4=new ArrayList<>();
		
		m1.add(new Movie1(111,"Avatar",4));
		m2.add(new Movie1(231,"king",2));
		m3.add(new Movie1(123,"rrr",5));
		m4.add(new Movie1(324,"abcd",3));
		
		at.add(new Theater(542,"Bollywood",m1));
		at.add(new Theater(341,"inox",m2));
		at.add(new Theater(222,"pvr",m3));
		at.add(new Theater(333,"xyz",m4));
		
		/*Iterator<Theater>tr1=at.iterator();
		while(tr1.hasNext())
		{
			Theater t1=tr1.next();
			Iterator<Movie1> m=m1.iterator();
			while(m.hasNext())
			{
				Movie1 mov=m.next();
				if(mov.noofshows<=2)
				{
					m.remove();
				}
				
			}
			
		}*/
		for(Theater th:at)
		{
			Iterator<Movie1> m=m1.iterator();
			while(m.hasNext())
			{
				Movie1 mov=m.next();
				if(mov.noofshows<=2)
				{
					m.remove();
				}
		}
		}
		
		System.out.println(at);
	}

}
