package collections;

public class Movie1 {
	int id,noofshows;
	String name;
	Movie1(int id,String name,int noofshows)
	{
		this.id=id;
		this.name=name;
		this.noofshows=noofshows;
	}
	public String toString()
	{
		return id+" "+name+" "+noofshows;
	}
	
}
