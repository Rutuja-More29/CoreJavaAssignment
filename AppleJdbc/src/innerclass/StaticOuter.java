package innerclass;

public class StaticOuter {
	int a=100;
	static int b=200;
	static class Inner{
		int a=1000;
		static int b=2000;
		void display() {
			System.out.println("static inner class acess only static member");
			System.out.println(b);
			
			//to call non static create object of class
			StaticOuter o=new StaticOuter();
			System.out.println(o.a);
		}
	}
}
