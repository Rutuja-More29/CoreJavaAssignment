
package package1;

public class Test1 {

	int a=100;
	private int b=200;
	protected int c=300;
	public int d=400;
	public void msg()
	{
		System.out.println("public method");
	}
	public static void main(String[] args) {
		Test1 t1=new Test1();
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);
		t1.msg();
	}

}
