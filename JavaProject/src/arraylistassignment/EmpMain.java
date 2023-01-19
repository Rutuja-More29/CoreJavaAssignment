package arraylistassignment;
import java.util.ArrayList;
import java.util.Collections;
public class EmpMain {
	
	void setArrayList(ArrayList<Emp>e)
	{
		e.add(new Emp(111,"radha",56000));
		e.add(new Emp(987,"siya",89000));
		e.add(new Emp(456,"yash",75000));
		e.add(new Emp(345,"shubham",99000));
		e.add(new Emp(211,"ved",45000));
	}
	void sortArrayList(ArrayList<Emp>e)
	{
		Collections.sort(e);
	}
	public static void main(String[] args) {
	ArrayList<Emp> e=new ArrayList<>();
	EmpMain em=new EmpMain();
	em.setArrayList(e);
	em.sortArrayList(e);
	System.out.println(e);
	}

}
