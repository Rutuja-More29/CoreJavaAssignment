package map;

public class Address {
	String city,state;
	Address(String city,String state)
	{
		this.city=city;
		this.state=state;
	}
	public String toString()
	{
		return city+" "+state;
	}
}
