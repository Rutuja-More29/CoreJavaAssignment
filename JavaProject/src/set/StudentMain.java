package set;
import java.util.HashSet;
import java.util.Scanner;
public class StudentMain {
	void setlist(HashSet<Student> hs)
	{
		Student s1=new Student();
		s1.setId(11);
		s1.setName("hruta");
		s1.setDept("comp");
		s1.setMarks(78);
		hs.add(s1);
		
		Student s2=new Student();
		s2.setId(112);
		s2.setName("vijay");
		s2.setDept("mech");
		s2.setMarks(90);
		hs.add(s2);
		
		Student s3=new Student();
		s3.setId(222);
		s3.setName("jay");
		s3.setDept("mech");
		s3.setMarks(80);
		hs.add(s3);
		
		Student s4=new Student();
		s4.setId(2);
		s4.setName("siya");
		s4.setDept("civil");
		s4.setMarks(70);
		hs.add(s4);
		System.out.println(hs);
		for(Student s:hs)
		{
			s.setMarks(s.getMarks()+2);
		}
	
		System.out.println(hs);
		
	}
	void search(HashSet<Student> hs)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,name,dept:");
		int id=sc.nextInt();
		String dept=sc.next();
		
		for(Student s:hs)
		{
			if(s.getId()==id)
			{
				s.setDept(dept);
			}
			
		}
		System.out.println(hs);
	}
	

	public static void main(String[] args) {
		HashSet<Student>hs=new HashSet<>();
		StudentMain sm=new StudentMain();
		sm.setlist(hs);
		sm.search(hs);

	}

}
