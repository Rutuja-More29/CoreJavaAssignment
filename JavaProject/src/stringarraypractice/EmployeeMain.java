package stringarraypractice;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp[]=new Employee[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id,name,dept,salary:");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			float salary=sc.nextFloat();
			Employee e=new Employee();
			e.setId(id);
			e.setName(name);
			e.setDept(dept);
			e.setSalary(salary);
			
			emp[i]=e;
		}
		for(Employee em:emp)
		{
			if(em.getDept().equalsIgnoreCase("dev"))
			{
				em.hike();
				System.out.println(em);
			}
		}

	}

}
