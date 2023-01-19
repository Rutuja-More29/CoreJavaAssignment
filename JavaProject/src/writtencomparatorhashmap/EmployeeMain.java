package writtencomparatorhashmap;
import java.util.ArrayList;
import java.util.Collections;
public class EmployeeMain {
	void setArrayList(ArrayList<Employee>emp)
	{
		Profile p1=new Profile("ahmednagar","maharashtra");
		Profile p2=new Profile("pune","maharashtra");
		Profile p3=new Profile("banglore","karnataka");
		Profile p4=new Profile("cochin","kerla");
		Profile p5=new Profile("nashik","maharashtra");
		
		emp.add(new Employee(101,"ratan","dev",678900,p1));
		emp.add(new Employee(421,"ganesh","prod",67000,p2));
		emp.add(new Employee(561,"stano","test",89000,p3));
		emp.add(new Employee(674,"sancho","dev",78400,p4));
		emp.add(new Employee(567,"samay","sales",45000,p5));
		emp.add(new Employee(101,"ratan","dev",678900,p1));
		emp.add(new Employee(421,"ganesh","prod",67000,p3));
	}

	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<>();
		EmployeeMain em=new EmployeeMain();
		em.setArrayList(emp);
		System.out.println(emp);
	System.out.println("-------sorted list-------");	
		Collections.sort(emp);
		System.out.println(emp);
		Collections.sort(emp,new EmployeeSortCountry());
		for(Employee e:emp)
		{
			System.out.println(e);
		}
	}

}
