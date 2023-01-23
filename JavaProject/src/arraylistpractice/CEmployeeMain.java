package arraylistpractice;
import java.util.ArrayList;
import java.util.Collections;
public class CEmployeeMain {
	void setArrayList(ArrayList<CEmployee>al)
	{
		CEmployee e1=new CEmployee();
		e1.setId(11);
		e1.setName("rahul");
		e1.setDept("dev");
		e1.setSalary(67000);
		al.add(e1);
		
		CEmployee e2=new CEmployee();
		e2.setId(12);
		e2.setName("seema");
		e2.setDept("test");
		e2.setSalary(89000);
		al.add(e2);
		
		CEmployee e3=new CEmployee();
		e3.setId(8);
		e3.setName("gayatri");
		e3.setDept("sales");
		e3.setSalary(45000);
		al.add(e3);
		
		CEmployee e4=new CEmployee();
		e4.setId(6);
		e4.setName("naina");
		e4.setDept("sales");
		e4.setSalary(45000);
		al.add(e4);
	}
	void sort(ArrayList<CEmployee>al)
	{
		Collections.sort(al,new DeptSort());
	}
	void sortcomparable(ArrayList<CEmployee>al)
	{
		Collections.sort(al);
	}

	public static void main(String[] args) {
		ArrayList<CEmployee>al=new ArrayList<>();
		CEmployeeMain ce=new CEmployeeMain();
		ce.setArrayList(al);
		ce.sort(al);
		System.out.println(al);
		ce.sortcomparable(al);
		System.out.println(al);
		

	}

}
