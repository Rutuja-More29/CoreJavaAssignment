package arraylistpractice;

public class Shipment {
	int shipId;
	String custname;
	Address add;
	MyDate d;
	public int getShipId() {
		return shipId;
	}
	public void setShipId(int shipId) {
		this.shipId = shipId;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public MyDate getD() {
		return d;
	}
	public void setD(MyDate d) {
		this.d = d;
	}
	public String toString()
	{
		return shipId+" "+custname+" "+add+" "+d;
	}
}
