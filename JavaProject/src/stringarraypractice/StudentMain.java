package stringarraypractice;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		Student stud[]=new Student[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter student id,name,dept:");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			
			int marks[]=new int[4];
			System.out.println("Enter marks:");
			for(int j=0;j<3;j++)
			{
				marks[j]=sc.nextInt();
			}
			Student s=new Student();
			s.setId(id);
			s.setName(name);
			s.setDept(dept);
			s.setMarks(marks);
			stud[i]=s;
			
		}
		for(Student s1:stud)
		{
			if(s1.getId()==2)
			{
				System.out.println(s1.getName()+" "+s1.getDept()+" "+s1.getMarks());
			}
		}

	}

}
