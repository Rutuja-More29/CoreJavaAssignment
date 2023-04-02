package mappractice;

public class Item {
	int id,price,qty;
	String name;
	Item(int id,String name,int price,int qty){
		this.id=id;
		this.name=name;
		this.price=price;
		this.qty=qty;
	}
	public String toString() {
		return id+" "+name+" "+price+" "+qty;
	}
}
