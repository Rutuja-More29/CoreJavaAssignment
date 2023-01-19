package map;

public class OrderStatus {
	String deliverydate,status;
	OrderStatus(String deliverydate,String status)
	{
		this.deliverydate=deliverydate;
		this.status=status;
	}
	public String toString()
	{
		return deliverydate+" "+status;
	}
}
