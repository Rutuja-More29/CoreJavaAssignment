package comparablecomparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class EmployeeArrayList {
	void setElement(ArrayList<Employee>emp1)
	{
		emp1.add(new Employee(111,"rita","dev",70000));
		emp1.add(new Employee(111,"sita","test",80000));
		emp1.add(new Employee(111,"gita","sale",560000));
		emp1.add(new Employee(111,"riya","prod",880000));
		emp1.add(new Employee(111,"prita","de",670000));
		emp1.add(new Employee(111,"priya","marketing",570000));
		emp1.add(new Employee(111,"siya","dev",470000));
		
		
		
	}
	
	
		
	

	public static void main(String[] args) {
		ArrayList<Employee>emp=new ArrayList<>();
		
		EmployeeArrayList empl=new EmployeeArrayList();
		System.out.println("----------------sort using comparable------------");
		empl.setElement(emp);
		System.out.println(emp);
		Collections.sort((emp) );
		System.out.println("Sorted:"+emp);
		
		Collections.reverse(emp);
		System.out.println("reverse:"+emp);
		
		System.out.println();
		System.out.println("----------------------sort using comparator based employee name----------------");
		
		Collections.sort(emp,new EmployeeNameSort());    // EmployeeName Class
		System.out.println(emp);
	}

}
