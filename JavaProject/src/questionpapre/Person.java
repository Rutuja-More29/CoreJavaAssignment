package questionpapre;
//WAP to create deep copy of person object make use parameterized constructor to create deep copy of person class create deep copy of this object

public class Person {
	int id;
	String name;
	Country c;

	Person(int id, String name, Country c) {
		this.id = id;
		this.name = name;
		this.c = c;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getC() {
		return c;
	}

	public void setC(Country c) {
		this.c = c;
	}
	public String toString()
	{
		return id+"" +name+" "+c;
	}
	public Person deepCopy() {
		return new Person(this.id,this.name,new Country(this.c.getCid(),this.c.getCountry()));
	}

	

	

}
