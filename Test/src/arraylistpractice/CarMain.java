package arraylistpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class CarMain {
	void create(ArrayList<Car>al) {
		Car c=new Car();
		c.setId(11);
		c.setName("audi");
		c.setPrice(678000);
		c.setLyear(1990);
		al.add(c);
		
		Car c1=new Car();
		c1.setId(12);
		c1.setName("maruti");
		c1.setPrice(50000);
		c1.setLyear(1960);
		al.add(c1);
		
		Car c2=new Car();
		c2.setId(13);
		c2.setName("seltos");
		c2.setPrice(67000);
		c2.setLyear(2010);
		al.add(c2);
		Iterator<Car>itr=al.iterator();
		while(itr.hasNext()) {
			Car cr=itr.next();
			if(cr.getLyear()==1950) {
				itr.remove();
			}
		}
		System.out.println(al);
	}
	public static void main(String[] args) {
		ArrayList<Car>al=new ArrayList<>();
		CarMain cm=new CarMain();
		cm.create(al);

	}

}
