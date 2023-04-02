package comparatorcomparablepractice;

public class Car implements Comparable<Car> {
	int id,price,lyear;
	String name,brandname;
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
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String toString()
	{
		return id+" "+name+" "+brandname+" "+lyear;
	}
	public int compareTo(Car c) {
	if(this.brandname.compareToIgnoreCase(c.getBrandname())==0) {
			if(this.price>c.price)
				return 1;
			else if(this.price<c.price)
				return -1;
			else
				return 0;
		}
		else
		{
			return this.brandname.compareToIgnoreCase(c.getBrandname());
		}
	}
}
