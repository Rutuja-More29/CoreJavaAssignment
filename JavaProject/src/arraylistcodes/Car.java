package arraylistcodes;

import java.util.ArrayList;
import java.util.Iterator;

public class Car {
	int id,lyear,price;
	String name;
	Car(int id,String name,int lyear,int price)
	{
		this.id=id;
		this.name=name;
		this.lyear=lyear;
		this.price=price;
		
	}
	public String toString()
	{
		return id+" "+name+" "+lyear+" "+price;
	}

	public static void main(String[] args) {
		ArrayList<Car> ac=new ArrayList<>();
		ac.add(new Car(111,"thar",2022,970000));
		ac.add(new Car(134,"audi",2021,150000000));
		ac.add(new Car(213,"maruti",1990,4500000));
		ac.add(new Car(103,"audiq8",2021,15670000));
		
		Iterator<Car>itc=ac.iterator();
		while(itc.hasNext())
		{
			Car c=itc.next();
			if(c.lyear==1990)
			{
				itc.remove();
			}
		}
		System.out.println(ac);

	}

}
