package package2;
import package1.Test1;
public class Test4 extends Test1 {

	public static void main(String[] args) {
		Test4 t1=new Test4();
		 // System.out.println(t1.a);// default
	//	System.out.println(t1.b); //private
		System.out.println(t1.c);  // protected
		System.out.println(t1.d);  // public


	}

}
