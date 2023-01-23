package map;

public class Product {
	int price;
	String name,material;
	Product(String name,String material,int price)
	{
		this.name=name;
		this.material=material;
		this.price=price;
	}
	public String toString()
	{
		return name+" "+material+" "+price;
	}
}
