package wriitenAssignment2;

public class TestThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread  tt1=new TestThread ();
		TestThread  tt2=new TestThread ();
		
		System.out.println("Name of thread tt1:"+tt1.getName());
		System.out.println("Name of thread tt2:"+tt2.getName());
		tt1.start();
		tt2.start();
		
		tt1.setName("ThreadEx");
		System.out.println("After changing name of tt1:"+tt1.getName());

	}

}
