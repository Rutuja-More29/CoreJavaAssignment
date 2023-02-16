package questionpapre;

public class Output5 {

	public static void main(String[] args) {
		int []a= {4,5,6,7,8};
		foo(a);
		System.out.println(a[4]);

	}
	static void foo(int[]a)
	{
		a[4]=0;
		a=null;
	}

}
