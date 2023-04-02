package monthlytest;

public class RecursiveFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int result=factorial(n);
		System.out.println("factorial of:"+n+"is "+result);
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 1;
		}else
		{
			return n*factorial(n-1);
		}
		
	}

}
