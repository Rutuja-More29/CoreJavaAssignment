package vectorassignment;
import java.util.Vector;
import java.util.Iterator;
public class EmployeeMain {
	void setEmployee(Vector<Employee>v)
	{
		v.add(new Employee("rita","dev",4000));
		v.add(new Employee("gita","test",5000));
		v.add(new Employee("neha","dev",6000));
		v.add(new Employee("veera","sales",9000));
	}
	void remove(Vector<Employee>v)
	{
		Iterator<Employee> itr=v.iterator();
		while(itr.hasNext())
		{
			if(itr.next().salary<5000)
			{
				itr.remove();
			}
		}
		System.out.println(v);
	}

	public static void main(String[] args) {
		Vector<Employee> v=new Vector<>();
		EmployeeMain e=new EmployeeMain();
		e.setEmployee(v);
		e.remove(v);

	}

}
