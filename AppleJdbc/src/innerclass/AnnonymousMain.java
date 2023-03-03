package innerclass;

class ABC{
	void display() {
		System.out.println("inside normal class display method");
	}
}
abstract class B{
	abstract void add(int a,int b);
}
interface XYZ{
	void multiply(int a,int b);
}

public class AnnonymousMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC obj=new ABC()
		 {
			void display() {
				System.out.println("inside normal class display method");
			}
		};
		obj.display();
		
		
		B ob=new B()
				{
			void add(int a,int b) {
				System.out.println("addition is:"+(a+b));
			}
				};
		ob.add(100,200)	;	
		
		
		XYZ objin=new XYZ()
				{
			public void multiply(int a,int b) {
				System.out.println("multiplication:"+(a*b));
			}
				};
				objin.multiply(100, 50);

	}

}
