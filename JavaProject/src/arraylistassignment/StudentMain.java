package arraylistassignment;
import java.util.ArrayList;
public class StudentMain {
	void setArrayList(ArrayList<Student>al)
	{
		ArrayList<Integer>marks1=new ArrayList<>();
		ArrayList<Integer>marks2=new ArrayList<>();
		ArrayList<Integer>marks3=new ArrayList<>();
		marks1.add(50);
		marks2.add(70);
		marks3.add(80);
		
		Student s1=new Student();
		s1.setId(45);
		s1.setName("rahul");
		s1.setMarks(marks1);
		al.add(s1);
		
		Student s2=new Student();
		s2.setId(12);
		s2.setName("vina");
		s2.setMarks(marks2);
		al.add(s2);
		
		Student s3=new Student();
		s3.setId(19);
		s3.setName("gaurav");
		s3.setMarks(marks3);
		al.add(s3);
		
		System.out.println(al);
		
		al.contains(s1);
		System.out.println(al);
		
	}
	
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		
        StudentMain  sm=new StudentMain();
        sm.setArrayList(al);
        
        
	}

}
