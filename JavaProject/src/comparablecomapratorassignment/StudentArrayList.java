package comparablecomapratorassignment;
import java.util.ArrayList;
import java.util.Collections;
public class StudentArrayList {
	void element(ArrayList<Student>s)
	{
		s.add(new Student(101,"amay","comp",70));
		s.add(new Student(201,"abhi","aiml",90));
		s.add(new Student(162,"rita","comp",70));
		s.add(new Student(191,"sakshi","civil",60));
		s.add(new Student(109,"ram","mech",70));
		s.add(new Student(171,"amay","comp",80));
		s.add(new Student(881,"vina","aiml",40));
	}
	void sortElement(ArrayList<Student>s)
	{
		Collections.sort(s);
		
	}

	public static void main(String[] args) {
		ArrayList<Student> as=new ArrayList<>();
		StudentArrayList asl=new StudentArrayList();
		
		asl.element(as);
		System.out.println(as);
		System.out.println();
		asl.sortElement(as);
		System.out.println( "sorted marks:"+as);
	}

}
