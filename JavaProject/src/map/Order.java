package map;

public class Order {
	int id,totalcost;
	String city;
	OrderStatus orst;
	Order(int id,int totalcost,String city,OrderStatus orst)
	{
		this.id=id;
		this.totalcost=totalcost;
		this.city=city;
		this.orst=orst;
	}
	public String toString()
	{
		return id+" "+totalcost+" "+city+" "+orst;
	}
}
