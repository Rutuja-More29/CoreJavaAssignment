package set;
import java.util.HashSet;
import java.util.Scanner;
public class EmployeeMain {
	void createHashSet(HashSet<Employee>hs)
	{
		Employee e1=new Employee();
		e1.setId(112);
		e1.setName("rutuja");
		e1.setDept("dev");
		e1.setSalary(890000);
		e1.setContact(876543219);
		hs.add(e1);
		
		Employee e2=new Employee();
		e2.setId(432);
		e2.setName("vrishali");
		e2.setDept("data");
		e2.setSalary(760000);
		e2.setContact(986734126);
		hs.add(e2);
		
		Employee e3=new Employee();
		e3.setId(986);
		e3.setName("abhi");
		e3.setDept("aiml");
		e3.setSalary(150000);
		e3.setContact(67453298);
		hs.add(e3);
		
		Employee e4=new Employee();
		e4.setId(344);
		e4.setName("swara");
		e4.setDept("account");
		e4.setSalary(45000);
		e4.setContact(976543821);
		hs.add(e4);
		
		Employee e5=new Employee();
		e5.setId(677);
		e5.setName("shubham");
		e5.setDept("prod");
		e5.setSalary(67000);
		hs.add(e5);
		System.out.println(hs);
	}
	void updateEmployee(HashSet<Employee> hs)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,salary:");
		int id=sc.nextInt();
		int salary=sc.nextInt();
		//long contact=sc.nextLong();
		for(Employee e:hs)
		{
			if(e.getId()==id)
			{
				e.setSalary(salary);
				//e.setContact(contact);
			}
		}
		System.out.println(hs);
	}

	public static void main(String[] args) {
		HashSet<Employee>hs=new HashSet<>();
		EmployeeMain em=new EmployeeMain();
		em.createHashSet(hs);
		em.updateEmployee(hs);
		//System.out.println(hs);
		

	}

}
