package practicearraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class CarMain {
	void check(ArrayList<Car>al) {
		Car c=new Car();
		c.setId(111);
		c.setName("audi");
		c.setLyear(1990);
		al.add(c);
		
		Car c1=new Car();
		c1.setId(112);
		c1.setName("wagon");
		c1.setLyear(1998);
		al.add(c1);
		
		Car c2=new Car();
		c2.setId(113);
		c2.setName("maruti");
		c2.setLyear(1990);
		al.add(c2);
		
		Car c3=new Car();
		c3.setId(114);
		c3.setName("jagwar");
		c3.setLyear(2000);
		al.add(c3);
		
		Iterator<Car>itr=al.iterator();
		while(itr.hasNext()) {
			Car cr=itr.next();
			if(cr.getLyear()==1990) {
				itr.remove();
			}
		}
		System.out.println(al);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car>al=new ArrayList<>();
		CarMain cm=new CarMain();
		cm.check(al);
		

	}

}
