package map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class StudentMain {
	void createHashMap(HashMap<Integer,Student>stud)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter id,name,email,marks:");
			int id=sc.nextInt();
			String name=sc.next();
			String email=sc.next();
			int marks=sc.nextInt();
			Student s=new Student();
			s.setName(name);
			s.setEmail(email);
			s.setMarks(marks);
			stud.put(id, s);
		}
	}
	void display(HashMap<Integer, Student>stud1)
	{
		for(Map.Entry<Integer,Student> ent:stud1.entrySet())
		{
			/*if(ent.getValue().getMarks()==70)
				System.out.println(ent.getKey()+" "+ent.getValue());*/
			if(ent.getValue().getName().startsWith("r"))
				System.out.println(ent.getKey()+" "+ent.getValue());
		}
	}
	
	public static void main(String[] args) {
		HashMap<Integer,Student> hmap=new HashMap<>();
		StudentMain sm=new StudentMain();
		sm.createHashMap(hmap);
		sm.display(hmap);

	}

}
