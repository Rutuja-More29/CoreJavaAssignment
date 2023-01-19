package map;

public class StudentH {
	int id,marks;
	String name,dept;
	StudentH(int id,String name,String dept,int marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks;
	}
	public int hashCode()
	{
		return id;
	}
	public boolean equals(Object o)
	{
		StudentH sh=(StudentH) o;     
		if(this.id==sh.id)          // this -new map element   and o-hashtable element
		{
			sh.name=this.name;   // check name is same or not in map and Hashtable  element-object
			//sh.dept=this.dept;
		//	sh.marks=this.marks;
			return true;
		}
		else
			return false;
	}
}
