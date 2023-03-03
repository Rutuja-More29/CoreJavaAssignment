package iofile;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EmployeeMain {
	ArrayList<Employee>al=new ArrayList<>();
	
	void addData() {
		al.add(new Employee(111,"riya","sales",70000));
		al.add(new Employee(121,"siya","marketing",50000));
		al.add(new Employee(11,"rahul","sales",80000));
		al.add(new Employee(311,"suresh","dev",70000));
		
	}
	void writeData(String name) {
	FileOutputStream fos;
	try {
		fos=new FileOutputStream(name);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("done");
	}
	void readData(String name) {
		FileInputStream fis;
		ArrayList<Employee>emp =new ArrayList<>();
		try {
			fis=new FileInputStream(name);
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			boolean cont=true;
			Employee e=null;
			while(cont==true) {
				try {
					e=(Employee)ois.readObject();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(e!=null) {
					emp.add(e);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(EOFException e) {}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(emp);
	}

	public static void main(String[] args) {
		String filename="D://textfile1.txt";
		EmployeeMain e1=new EmployeeMain();
		e1.addData();
		e1.writeData(filename);
		e1.readData(filename);

	}

}
