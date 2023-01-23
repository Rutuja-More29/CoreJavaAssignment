package set;

public class Item1 {
	int id,price,qty;
	String name;
	public Item1(int id, int price, int qty, String name) {
		
		this.id = id;
		this.price = price;
		this.qty = qty;
		this.name = name;
	}
	
	public String toString() {
		return "Item [id=" + id + ", price=" + price + ", qty=" + qty + ", name=" + name + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
