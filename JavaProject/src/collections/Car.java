package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Car {
	int id,price;
	String name,lyear,brandname;
	Car(int id,String name,String lyear,int price,String brandname)
	{
		this.id=id;
		this.name=name;
		this.lyear=lyear;
		this.price=price;
		this.brandname=brandname;
	}
	public String toString()
	{
		return id+" "+name+" "+lyear+" "+price+" "+brandname;
	}

	public static void main(String[] args) {
		ArrayList<Car> ac=new ArrayList<Car>();
		ac.add(new Car(101,"ford","1990",670000,"xyz"));
		ac.add(new Car(102,"thar","2022",7000000,"abcd"));
		ac.add(new Car(103,"fortuner","2010",560000,"abab"));
		ac.add(new Car(104,"seltos","2010",800000,"pqrs"));
		
		Iterator<Car>itr=ac.iterator();
		while(itr.hasNext()) {
		 Car c=itr.next();
		if(c.lyear.equalsIgnoreCase("1990"))
		{
			itr.remove();
		}
		}
		System.out.println(ac);
	}

}
