package mappractice;

public class Item {
	int id,price,qnty;
	String name;
	Item(int id, String name,int price,int qnty)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.qnty=qnty;
	}
	public String toString()
	{
		return id+" "+name+" "+price+" "+qnty;
	}
}
