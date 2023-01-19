package collections;

public class Car2 {
	int id,price;
	String name,lyear,brandname;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLyear() {
		return lyear;
	}
	public void setLyear(String lyear) {
		this.lyear = lyear;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String toString()
	{
		return id+" "+price+""+name+" "+lyear+" "+brandname;
	}

}
