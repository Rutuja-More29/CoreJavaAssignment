package arraylistpractice;
import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeDepartmentMain {
	void check(ArrayList<Employee>al)
	{
		Department d1=new Department();
		d1.setDid(101);
		d1.setDname("test");
		
		Department d2=new Department();
		d2.setDid(102);
		d2.setDname("dev");
		
		Employee e1=new Employee();
		e1.setId(454);
		e1.setName("radha");
		e1.setSalary(45000);
		e1.setDept(d1);
		al.add(e1);
		
		Employee e2=new Employee();
		e2.setId(464);
		e2.setName("sachi");
		e2.setSalary(78000);
		e2.setDept(d2);
		al.add(e2);
		
		Employee e3=new Employee();
		e3.setId(343);
		e3.setName("vina");
		e3.setSalary(67000);
		e3.setDept(d1);
		al.add(e3);
		
		
	}
	void iterateElement(ArrayList<Employee>al)
	{
		Iterator<Employee>itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee>al=new ArrayList<>();
		EmployeeDepartmentMain edm=new EmployeeDepartmentMain();
		edm.check(al);
		edm.iterateElement(al);
		System.out.println(al);
		

	}

}
