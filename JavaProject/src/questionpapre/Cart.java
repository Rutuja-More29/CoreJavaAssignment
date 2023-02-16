package questionpapre;

public class Cart {
	int itemno;
	String name;
	int qty;
	int rate;

	Cart(int itemno, String name, int qty, int rate) {
		this.itemno = itemno;
		this.name = name;
		this.qty = qty;
		this.rate = rate;

	}

	public int getItemno() {
		return itemno;
	}

	public void setItemno(int itemno) {
		this.itemno = itemno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
}
