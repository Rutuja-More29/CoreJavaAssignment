package collections;
import java.util.ArrayList;
public class Theater {
	int id;
	String name;
	ArrayList<Movie1>m1;
	Theater(int id,String name,ArrayList<Movie1>m1)
	{
		this.id=id;
		this.name=name;
		this.m1=m1;
	}
	public String toString()
	{
		return id+" "+name+" "+m1;
	}
}
