package practiceonarray;
import java.util.Scanner;
public class EmpDate {

	public static void main(String[] args) {
	Emp e[]=new Emp[3];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter id,name,salary:");
		int id=sc.nextInt();
		String name=sc.next();
		int salary=sc.nextInt();
	
	
			System.out.println("Enter day,month,year:");
			String day=sc.next();
			String month=sc.next();
			String year=sc.next();
			Date d1=new Date();
			d1.setDay(day);
			d1.setMonth(month);
			d1.setYear(year);
		
			
	
		Emp em=new Emp();
		em.setId(id);
		em.setName(name);
		em.setSalary(salary);
		em.setD(d1);
		e[i]=em;
		
		
	}
	for(Emp e1:e)
	{
		//System.out.println(e1);
		if(e1.getD().equals("mon feb 2023"))
		{
			System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary());
		}
	}

	}

}
