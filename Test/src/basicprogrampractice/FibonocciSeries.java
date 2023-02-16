package basicprogrampractice;
import java.util.Scanner;
public class FibonocciSeries {
	void display(int num) {
		int a=0,b=1;
		System.out.print(a+" "+b);
		int c;
		for(int i=0;i<=num;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		FibonocciSeries f=new FibonocciSeries();
		f.display(num);
	}

}
