package iofile;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StudentMain {
	ArrayList<Student> al=new ArrayList<>();
	void addData() {
		al.add(new Student(101,"rahul","comp",70));
		al.add(new Student(111,"riya","mech",80));
		al.add(new Student(10,"sanjay","ece",70));
		al.add(new Student(155,"rita","comp",90));
	}
	void writeObjectData(String name) {
		FileOutputStream fos;
	
		
		try {
			fos=new FileOutputStream(name);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			/*Student s1=new Student();
			s1.setId(101);
			s1.setName("raj");
			s1.setMarks(70);
			s1.setDept("computer");
			
			oos.writeObject(s1);*/
			
			for(Student s:al) {
				oos.writeObject(s);
			}
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}
	
	void readObjectData(String name) {
		FileInputStream fis;
		ArrayList<Student>stud=new ArrayList<>();
		try {
			fis=new FileInputStream(name);
			ObjectInputStream ois=new ObjectInputStream(fis);
			boolean cont=true;
			
			Student s=null;
			while(cont) {
				s=(Student)ois.readObject();
				catch (FileNotFoundException |EOFException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(s!=null) {
					stud.add(s);
				}
				else
				{
					cont=false;
				}
			}
			System.out.println(stud);
			/*Student s1=(Student)ois.readObject();
			System.out.println(s1);*/
			
			
		}
		 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		String s="D://textfile1.txt";
		StudentMain s11=new StudentMain();
		s11.addData();
		//s11.writeObjectData(s);
		s11.readObjectData(s);

	}

}
