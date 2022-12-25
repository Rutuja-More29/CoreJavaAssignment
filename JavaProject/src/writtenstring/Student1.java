package writtenstring;

import java.util.Scanner;

import com.basicprogram.Marks;

public class Student1 {

	public static void main(String[] args) {
		Student stud[] = new Student[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id,name,rollNo:");
		for (int i = 0; i < 2; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			int rollNo = sc.nextInt();
			
			
				int  mark[]=new int[2];
				System.out.println("Enter marks:");
				for(int j=0;j<mark.length;j++)
				{
					 mark[j]=sc.nextInt();
					 
			
				}
			
			Student s1 = new Student();
			s1.setId(id);
			s1.setName(name);
			s1.setMarks(mark);
			s1.setRollNo(rollNo);
			stud[i] = s1;
			

		}

		for (Student s1 : stud) {
			if(s1.getId()==102)
			{
				for(int i=0;i<s1.getMarks().length;i++)
				{
					if(i==2)
			System.out.println(s1.getId() + " " + s1.getName() + " " + s1.getMarks()[i]);
				}
		}
		}

	}

}
