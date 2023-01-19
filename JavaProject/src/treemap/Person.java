package treemap;



public class Person implements Comparable<Person> {
	int id;
	String name,email,address;
	Person(int id,String name,String email, String address)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.address=address;
	}
	public String toString()
	{
		return id+" "+name+" "+email+" "+address;
	}
	public int compareTo(Person p)
	{
		return this.id-p.id;
	}
	
	
	
}
