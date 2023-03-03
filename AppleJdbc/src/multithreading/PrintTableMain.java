package multithreading;

import multithreading.PrintTable.MyThread1;

public class PrintTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable t=new PrintTable();
		
		MyThread1 m1=new MyThread1(t);
	//	MyThread2 m2=new MyThread2(t);
		
		m1.setName("Table5");
	//	m2.setName("Table10");
		m1.start();
	//	m2.start();

	}

}
