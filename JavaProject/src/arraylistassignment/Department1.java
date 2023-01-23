package arraylistassignment;
//use copy method of collection class to make a copy of given arraylist of employee check it create shallow copy or deep copy check if dept object is copied
public class Department1 {
	int did;
	String dname;
	Department1(int did,String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	public String toString()
	{
		return did+" "+dname;
	}
}
