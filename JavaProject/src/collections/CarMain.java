package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Car2> ac=new ArrayList<>();
		System.out.println("Enter size:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Car id,name,lyear,price,brandname:");
			int id=sc.nextInt();
			String name=sc.next();
			String lyear=sc.next();
			int price=sc.nextInt();
			String brandname=sc.next();
			Car2 c=new Car2();
			c.setId(id);
			c.setName(name);
			c.setLyear(lyear);
			c.setPrice(price);
			c.setBrandname(brandname);
			ac.add(c);
		}
		Iterator<Car2> itr=ac.iterator();
		while(itr.hasNext()) {
		Car2 c1=itr.next();
		if(c1.getLyear().equalsIgnoreCase("1990"))
		{
			itr.remove();
		}
		}
		System.out.println(ac);
	}
	

}
