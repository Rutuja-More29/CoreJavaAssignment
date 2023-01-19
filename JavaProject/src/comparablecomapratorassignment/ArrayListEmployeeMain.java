package comparablecomapratorassignment;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEmployeeMain {
	void setArrayList(ArrayList<ArrayListEmployee>em)
	{
		em.add(new ArrayListEmployee(111,"krishna",980000));
		em.add(new ArrayListEmployee(123,"ganesh",980000));
		em.add(new ArrayListEmployee(666,"radha",555000));
		
	}
	void sortArraylist(ArrayList<ArrayListEmployee>al)
	{
		Collections.sort(al);
	}
	public static void main(String[] args) {
		ArrayList<ArrayListEmployee> al=new ArrayList<>();
		ArrayListEmployeeMain alm=new ArrayListEmployeeMain();
		alm.setArrayList(al);
		alm.sortArraylist(al);
		System.out.println(al);
		
	}

}
