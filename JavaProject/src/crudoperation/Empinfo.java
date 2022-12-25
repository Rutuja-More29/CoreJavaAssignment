package crudoperation;
import java.util.Arrays;
import java.util.Scanner;

public class Empinfo {
	
	Scanner sc=new Scanner(System.in);
	
      
	Employee emp[]=new Employee[5];
	
	 void insertData()
	  {
		 Employee e1=new Employee();
		  for(int i=0;i<emp.length;i++)
		  {
			  System.out.println("Inset data:");
			  int id=sc.nextInt();
			  String name=sc.next();
			  String dept=sc.next();
			  int salary=sc.nextInt();
			  
			  e1.setId(id);
			  e1.setName(name);
			  e1.setDept(dept);
			  e1.setSalary(salary);
		  }
		  
	  }
	 void viewData()
	  {
		  System.out.println("Employee data");
		  for(Employee e:emp)
		  {
			  System.out.println("Employee id"+e.getId());
			  System.out.println("Employee name:"+e.getName());
			  System.out.println("Employee dept:"+e.getDept());
			 System.out.println("Employee salary:"+e.getSalary());
		  }
	  }
	 public static void main(String[] args) {
		 Empinfo emp1=new Empinfo();
			 		  
			emp1.insertData();
			emp1.viewData(); 
		}
			
}
