package crudoperation;

import java.util.Scanner;

public class EmpMain {
	Employee[]em;
	int index;
	 EmpMain(int size)
	{
		em=new Employee[size];
	}
	 void addEmployee(Employee e)
	 {
		 em[index++]=e;
	 }
	 void showAll()
	 {
		 for(int i=0;i<em.length;i++)
		 {
			 if(em!=null)
			 {
				 System.out.println(em[i].getId()+" "+em[i].getName()+" "+em[i].getDept()+" "+em[i].getSalary());
			 }
		 }
	 }
	/* Employee specificData(int id)
	 {
		 Employee em=null;
		 for(int i=0;i<em.length;i++)
		 {
			 if(em[i]!=null)
			 {
				if(em[i].getId()==id)
				{
					emp=em[i];
				}
			 }
		 }
		 return emp;
		 
	 }*/
	 

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		System.out.println("Enter data:");
		 for(int i=0;i<size;i++)
		  {
			 Employee em=new Employee();
			 System.out.println("Enter id:"+(i+1)+" Employee id");
			  int id=sc.nextInt();
			  System.out.println("Enter name:"+(i+1)+"Employee name");
			  String name=sc.next();
			  System.out.println("Enter dept:"+(i+1)+"Employee dept");
			  String dept=sc.next();
			  System.out.println("Enter salary:"+(i+1)+" Employee salary");
			  int salary=sc.nextInt();
			  
			  em.setId(id);
			  em.setName(name);
			  em.setDept(dept);
			  em.setSalary(salary);
		  }

	}

}
