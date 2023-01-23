package practiceonarray;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		Employee e[]=new Employee[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter id,name,salary:");
			int id=sc.nextInt();
			String name=sc.next();
			int salary=sc.nextInt();
			Employee emp=new Employee();
			emp.setId(id);
			emp.setName(name);
			emp.setSalary(salary);
			e[i]=emp;
		}
		for(Employee em:e)
		{
			if(em.getSalary()==60000)
			{
				System.out.println(em.getId()+" "+em.getName());
			}
		}
	}

}
