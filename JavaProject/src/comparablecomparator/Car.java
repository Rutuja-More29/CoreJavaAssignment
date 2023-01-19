package comparablecomparator;

public class Car implements Comparable<Car> {
	int id,lyear,price;
	String name,brandname;
	Car(int id,String name,String brandname,int lyear,int price)
	{
		this.id=id;
		this.name=name;
		this.brandname=brandname;
		this.lyear=lyear;
		this.price=price;
	}
	public String toString()
	{
		return id+" "+name+" "+brandname+" "+lyear+" "+price;
	}
	public int compareTo(Car c)
	{
		if(this.brandname .compareTo(c.brandname)==0)
		{
			if(this.price>c.price)
				return 1;
			else if(this.price<c.price)
				return -1;
			else                                // price is same then sort  on name
			{
				 return 0;                                 //return this.name.compareTo(c.name);
			}
		}
		else
		{
			return this.brandname.compareTo(c.brandname);
		}
	}
}
