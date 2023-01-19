package practicearray;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e[]=new Employee[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id,name dept,salary");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int salary=sc.nextInt();
			Employee emp=new Employee();
			emp.setId(id);
			emp.setName(name);
			emp.setDept(dept);
			emp.setSalary(salary);
			e[i]=emp;
			Date dt[]=new Date[3];
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter day,month,year:");
				String day=sc.next();
				String month=sc.next();
				String year=sc.next();
				 Date date=new Date();
				 date.setDay(day);
				 date.setMonth(month);
				 date.setYear(year);
				 dt[j]=date;
			}
			for(Employee ee:e)
			{
				System.out.println(ee.getId()+" "+ee.getName()+" "+ee.getSalary()+" "+ee.getD());
			}
		}
	}

}
