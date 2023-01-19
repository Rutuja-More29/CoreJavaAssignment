package writtencomparatorhashmap;
import java.util.ArrayList;
import java.util.Collections;
public class StudentMain {
	void setArrayList(ArrayList<Student>st)
	{
		st.add(new Student(12,"rita",20));
		st.add(new Student(18,"sneha",23));
		st.add(new Student(156,"kavya",20));
		st.add(new Student(321,"nayan",21));
	}

	public static void main(String[] args) {
		ArrayList<Student> stud=new ArrayList<Student>();
		StudentMain sm=new StudentMain();
		sm.setArrayList(stud);
		System.out.println(stud);
		System.out.println("----------sort by name-----");
		Collections.sort(stud,new ArrayListNameSort());
		System.out.println(stud);
		System.out.println("--------sort by rollno-----");
		Collections.sort(stud,new ArrayListRollNoSort());
		System.out.println(stud);
		System.out.println("----------sort by age--------");
		Collections.sort(stud,new ArrayListAgeSort());
		System.out.println(stud);

	}

}
