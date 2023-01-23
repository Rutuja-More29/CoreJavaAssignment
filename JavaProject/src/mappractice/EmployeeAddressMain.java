package mappractice;
import java.util.HashMap;
import java.util.ArrayList;
public class EmployeeAddressMain {
	void createArrayList(ArrayList<Employee>emp)
	{
		Address a1=new Address();
		a1.setCity("ahmednagar");
		a1.setState("maharastra");
		
		Address a2=new Address();
		a2.setCity("pune");
		a2.setState("maharastra");
		
		Address a3=new Address();
		a3.setCity("banglore");
		a3.setState("karnataka");
		
		Employee emp1=new Employee();
		emp1.setId(12);
		emp1.setName("rutu");
		emp1.setDept("dev");
		emp1.setSalary(890000);
		emp1.setAdd(a1);
		emp.add(emp1);
		
		Employee emp2=new Employee();
		emp2.setId(34);
		emp2.setName("hruta");
		emp2.setDept("test");
		emp2.setSalary(670000);
		emp2.setAdd(a2);
		emp.add(emp2);
		
		Employee emp3=new Employee();
		emp3.setId(56);
		emp3.setName("siya");
		emp3.setDept("sale");
		emp3.setSalary(450000);
		emp3.setAdd(a3);
		emp.add(emp3);
		
		Employee emp4=new Employee();
		emp4.setId(2);
		emp4.setName("shubhu");
		emp4.setDept("dev");
		emp4.setSalary(890000);
		emp4.setAdd(a1);
		emp.add(emp4);
		
	}
	void createMap(ArrayList<Employee>emp,HashMap<Employee,Integer>hm)
	{
		for(Employee em:emp)
		{
			
			
				String s=em.getAdd().getCity();
			if(hm.containsKey(s))	
			{
				int i=hm.get(s);
				i=i+1;
				hm.put(em, i);
			}
			else
			{
				hm.put(em, 1);
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Employee>emp=new ArrayList<>();
		
		HashMap<Employee,Integer>hm=new HashMap<>();
		EmployeeAddressMain eam= new EmployeeAddressMain();
		eam.createArrayList(emp);
		eam.createMap(emp, hm);
		System.out.println(hm);
		

	}

}
