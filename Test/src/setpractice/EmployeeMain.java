package setpractice;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeMain {

		void set(HashSet<Employee>hs) {
			Employee e=new Employee();
			e.setEid(111);
			e.setEname("radha");
			e.setDept("sales");
			e.setSalary(568000);
			hs.add(e);
			
			Employee e1=new Employee();
			e1.setEid(123);
			e1.setEname("siya");
			e1.setSalary(234560);
			e1.setDept("finance");
			hs.add(e1);
			
			Employee e2=new Employee();
			e2.setEid(345);
			e2.setEname("krishna");
			e2.setSalary(54000);
			e2.setDept("test");
			hs.add(e2);
			
		}
		void updateSalary(HashSet<Employee>hs) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id:");
			int id=sc.nextInt();
			for(Employee emp:hs) {
				if(emp.getEid()==id) {
					emp.setSalary(emp.getSalary()+500);
				}
			}
			System.out.println(hs);
		}
		void updateDept(HashSet<Employee>hs) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter dept:");
			String dept=sc.next();
			for(Employee emp:hs) {
				emp.setDept(dept);
			}
			System.out.println(hs);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee>hs=new HashSet<Employee>();
		EmployeeMain em=new EmployeeMain();
		em.set(hs);
		em.updateSalary(hs);
		em.updateDept(hs);

	}

}
