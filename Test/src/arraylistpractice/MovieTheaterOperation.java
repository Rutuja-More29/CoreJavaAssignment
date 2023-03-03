package arraylistpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class MovieTheaterOperation {

		void setArrayList(ArrayList<Theater>t) {
			ArrayList<Movie>me=new ArrayList<>();
			ArrayList<Movie>me1=new ArrayList<>();
			ArrayList<Movie>me2=new ArrayList<>();
			
			Movie m=new Movie();
			m.setId(111);
			m.setName("avtar");
			m.setNoofshows(5);
			me.add(m);
			
			Movie m1=new Movie();
			m1.setId(112);
			m1.setName("bramhastra");
			m1.setNoofshows(10);
			me.add(m1);
			
			Movie m2=new Movie();
			m2.setId(113);
			m2.setName("double dhamal");
			m2.setNoofshows(4);
			me1.add(m2);
			
			Movie m3=new Movie();
			m3.setId(5);
			m3.setName("ms dhoni");
			m3.setNoofshows(2);
			me1.add(m3);
			
			Movie m4=new Movie();
			m4.setId(90);
			m4.setName("rabta");
			m4.setNoofshows(4);
			me2.add(m4);
			
			Movie m5=new Movie();
			m5.setId(12);
			m5.setName("ved");
			m5.setNoofshows(4);
			me2.add(m5);
			
			Theater t1=new Theater();
			t1.setTid(991);
			t1.setTname("nxcinema");
			t1.setMovie(me);
			t.add(t1);
			
			Theater t2=new Theater();
			t2.setTid(992);
			t2.setTname("zeecinema");
			t2.setMovie(me1);
			t.add(t2);
			
			Theater t3=new Theater();
			t3.setTid(996);
			t3.setTname("phnoeix");
			t3.setMovie(me2);
			t.add(t3);
			
		}
		void display(ArrayList<Theater>t) {
			for(Theater tr:t) {
				System.out.println(tr);
			}
		}
		void removeMovie(ArrayList<Theater>t) {
			for(Theater tr:t) {
				Iterator<Movie>itr=tr.movie.iterator();
				while(itr.hasNext()) {
					Movie mo=itr.next();
					if(mo.getNoofshows()<=3) {
						itr.remove();
					}
				}
				System.out.println(tr);
			}
		}
}
