package arraylistpractice;

public class Car {
	int id,price,lyear;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getLyear() {
		return lyear;
	}
	public void setLyear(int lyear) {
		this.lyear = lyear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return id+" "+name+" "+price+" "+lyear;
	}
}
