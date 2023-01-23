package practice;
import java.util.Scanner;
public class FibonacciSeries {
	void displayfib(int num)
	{
		int f1=0,f2=1;
		int f3;
		System.out.print(f1+" "+f2);
		for(int i=2;i<num;i++)
		{
			f3=f1+f2;
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		FibonacciSeries fs=new FibonacciSeries();
		fs.displayfib(num);

	}

}
