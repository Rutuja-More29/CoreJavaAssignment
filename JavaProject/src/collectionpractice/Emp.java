package collectionpractice;

public class Emp {
	int id;
	String name;
	Dept d;
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
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	public String toString()
	{
		return id+" "+name+" "+d;
	}
}
