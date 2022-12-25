package arrayassignment;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee em[] = new Employee[2];

		for (int i = 0; i < em.length; i++) {
			System.out.println("Enter Employee id,name,salary:");
			int id = sc.nextInt();
			String name = sc.next();
			int salary = sc.nextInt();
			Employee e1 = new Employee();
			e1.setId(id);
			e1.setName(name);
			e1.setSalary(salary);
			em[i] = e1;
		}
		for (Employee e1 : em) {
			System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getSalary());
		}

	}

}
