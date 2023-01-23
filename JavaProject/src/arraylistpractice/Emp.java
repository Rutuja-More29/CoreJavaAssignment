package arraylistpractice;

public class Emp {
	int id;
	String name;
	Dept d;
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
	public void setD(Dept d)
	{
		this.d=d;
	}
	public Dept getD()
	{
		return d;
	}
	public String toString()
	{
		return id+" "+name+" "+d;
	}
}
