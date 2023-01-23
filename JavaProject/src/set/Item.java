package set;

public class Item {
	int id,price,qty;
	String name;
	public Item(int id, int price, int qty, String name) {
		
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
