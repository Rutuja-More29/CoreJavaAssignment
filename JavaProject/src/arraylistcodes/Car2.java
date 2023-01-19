package arraylistcodes;

public class Car2 {
	int id,price,lyear;
	String name;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setLyear(int lyear)
	{
		this.lyear=lyear;
	}
	public int getLyear()
	{
		return lyear;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	public String toString()
	{
		return id+" "+name+" "+lyear+" "+price;
	}
}
