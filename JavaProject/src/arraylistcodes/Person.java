package arraylistcodes;

public class Person {
	int id;
	String name;
	long contact;
	Address add;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
		
	}
	public String getName()
	{
		return name;
	}
	public void setContact(long contact)
	{
		this.contact=contact;
	}
	public long getContact()
	{
		return contact;
	}
	public String toString()
	{
		return id+" "+name+" "+" "+contact+" "+add;
	}
}
