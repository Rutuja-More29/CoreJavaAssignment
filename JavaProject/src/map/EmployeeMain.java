package map;
import java.util.ArrayList;
import java.util.HashMap;
public class EmployeeMain {
	void setArrayList(ArrayList<Employee>emp)
	{
		emp.add(new Employee(1,"ram","sales",67000));
		emp.add(new Employee(45,"sham","test",67000));
		emp.add(new Employee(80,"sita","dev",80000));
		emp.add(new Employee(456,"geeta","test",86000));
		emp.add(new Employee(135,"neeta","dev",80000));
		emp.add(new Employee(980,"leena","test",67000));
		emp.add(new Employee(500,"meena","marketing",550000));
		emp.add(new Employee(432,"naina","sales",550000));
	}
	void createMap(ArrayList<Employee>emp,HashMap<String,Integer>hm)
	{
		for(Employee e:emp)
		{
			String dept=e.dept;
			if(hm.containsKey(dept))
			{
				int i=hm.get(dept);
				hm.put(dept, i+1);
			}
			else
			{
				hm.put(dept, 1);
			}
		}
	}
	void occuranceSalary(ArrayList<Employee>emp,HashMap<Integer,Integer>hm1)
	{
		for(Employee e:emp)
		{
			int salary=e.salary;
			if(hm1.containsKey(salary))
			{
				int i=hm1.get(salary);
				hm1.put(salary, i+1);
			}
			else
			{
				hm1.put(salary, 1);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee>emp=new ArrayList<Employee>();
		
		HashMap<String,Integer>hm=new HashMap<>();
		EmployeeMain em=new EmployeeMain();
		em.setArrayList(emp);
		System.out.println(emp);
		System.out.println("------dept based---------");
		em.createMap(emp, hm);
		System.out.println(hm);
		
		HashMap<Integer,Integer>hm1=new HashMap<>();
		System.out.println("--------salary based---------");
		em.occuranceSalary(emp, hm1);
		System.out.println(hm1);
	}

}
