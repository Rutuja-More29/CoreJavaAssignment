package arraylistassignment;

import java.util.ArrayList;


public class Employee1 implements Cloneable{
int id,salary;
String name;
Department1 dept1;
	Employee1(int id,String name,int salary,Department1 dept1)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept1=dept1;
	}
	public String toString()
	{
		return id+" "+name+" "+salary+" "+dept1;
	}
	public Object clone() throws CloneNotSupportedException
	{
		Employee1 e1=(Employee1)super.clone();
	//	e1.salary=(ArrayList<Integer>)salary.clone();
		return e1;
	}
}
