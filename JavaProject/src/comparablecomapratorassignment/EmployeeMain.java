package comparablecomapratorassignment;
import java.util.ArrayList;
import java.util.Collections;
public class EmployeeMain {
	void setElement(ArrayList<Employee>em)
	{
		em.add(new Employee(122,"Rutik","tester",25));
		em.add(new Employee(325,"Ganesh","analyst",50));
		em.add(new Employee(567,"Harsha","prod",23));
		em.add(new Employee(112,"varsha","data Engineer",25));
		em.add(new Employee(987,"veera","developer",26));
		em.add(new Employee(456,"swara","saler",51));
		em.add(new Employee(346,"swastik","trainer",45));
		em.add(new Employee(240,"samay","developer",30));
		em.add(new Employee(182,"aarav","tester",27));
		em.add(new Employee(551,"rita","data Engineer",35));
		
	}
	void sort(ArrayList<Employee>emp)
	{
		Collections.sort(emp);
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> am=new ArrayList<>();
		EmployeeMain empl=new EmployeeMain();
		empl.setElement(am);
		System.out.println(am);
		empl.sort(am);
		//System.out.println("--------sort by id--------");
		//System.out.println(am);
		System.out.println("--------descending sort--------");
		System.out.println(am);
	}

}
