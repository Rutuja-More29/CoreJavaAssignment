package arraylistcodes;
import java.util.ArrayList;
import java.util.Iterator;
public class DeptEmployeeMain {
	void setElement(ArrayList<Employee>empl)
	{
		Department d1=new Department(101,"dev");
		Department d2=new Department(104,"prod");
		Department d3=new Department(108,"test");
		
		empl.add(new Employee(111,"shreya",d1));
		empl.add(new Employee(211,"rachit",d2));
		empl.add(new Employee(342,"sakshi",d3));
		empl.add(new Employee(865,"sharvari",d3));
		
	}
	
	void removeElement(ArrayList<Employee>e)
	{
		Iterator<Employee> em= e.iterator();
		while(em.hasNext())
		{
			Employee ep=em.next();
			if(ep.id==101 )
			{
				em.remove();
			}
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<>();
		DeptEmployeeMain dm=new DeptEmployeeMain();
		dm.setElement(emp);
		System.out.println(emp);
		dm.removeElement(emp);
		System.out.println(emp);

	}

}
