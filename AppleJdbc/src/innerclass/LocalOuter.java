package innerclass;

public class LocalOuter {
	int a=100;
	static int b=2000;
	void display() {
		class Inner{       //abstract ,final
			int d=200;
			void show() {
				System.out.println("inside local inner class");
				System.out.println(a);
				System.out.println(b);
			}
		}
		Inner linner=new Inner();
		linner.show();
	}
}
