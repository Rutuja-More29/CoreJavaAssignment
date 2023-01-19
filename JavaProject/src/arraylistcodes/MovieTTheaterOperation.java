package arraylistcodes;

import java.util.ArrayList;
import java.util.Iterator;

public class MovieTTheaterOperation {
	void setArrayList(ArrayList<Theater> t)
	{
		
		ArrayList<MovieT> me1 = new ArrayList<>();
		ArrayList<MovieT> me2 = new ArrayList<>();
		ArrayList<MovieT> me3= new ArrayList<>();
		
		
		MovieT m1 = new MovieT();
		m1.setId(666);
		m1.setName("RRR");
		m1.setNoofshows(4);
		me1.add(m1);
		
		MovieT m2 = new MovieT();
		m2.setId(201);
		m2.setName("bhaganbag");
		m2.setNoofshows(5);
		me1.add(m2);
		
		MovieT m3 = new MovieT();
		m3.setId(120);
		m3.setName("king");
		m3.setNoofshows(2);
		me1.add(m3);
		
		
		MovieT m4 = new MovieT();
		m4.setId(111);
		m4.setName("Kantara");
		m4.setNoofshows(3);
		me2.add(m4);
		
		MovieT m5 = new MovieT();
		m5.setId(220);
		m5.setName("Ved");
		m5.setNoofshows(4);
		me2.add(m5);
		
		MovieT m6 = new MovieT();
		m6.setId(1);
		m6.setName("Avatar");
		m6.setNoofshows(4);
		me2.add(m6);
		
		
		MovieT m7 = new MovieT();
		m7.setId(101);
		m7.setName("Kantara");
		m7.setNoofshows(3);
		me3.add(m7);
		
	
		
		Theater t1 = new Theater();
		t1.setId(121);
		t1.setName("Inox");
		t1.setM(me1);
		t.add(t1);
		
		Theater t2 = new Theater();
		t2.setId(1001);
		t2.setName("bollywood");
		t2.setM(me2);
		t.add(t2);
		
		Theater t3 = new Theater();
		t3.setId(989);
		t3.setName("City Pride");
		t3.setM(me3);
		t.add(t3);
		
	}
	
	void Display(ArrayList<Theater> t)
	{
		for(Theater thr : t)
		{
			System.out.println(thr);
		}
	}
	void removeMovie(ArrayList<Theater> t)
	{
		for(Theater thr : t)
		{
			Iterator<MovieT> mtr = thr.m.iterator();
			while(mtr.hasNext())
			{
				if(mtr.next().noofshows <= 2)
				{
					mtr.remove();
				}
			}
		}
		
	}
}

