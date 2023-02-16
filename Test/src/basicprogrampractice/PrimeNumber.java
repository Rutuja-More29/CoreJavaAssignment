package basicprogrampractice;
import java.util.Scanner;
public class PrimeNumber {
	void display(int num) {
		for(int i=0;i<=num;i++) {
			int mid=i/2,j;
			for(j=2;j<=mid;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j>mid)
				System.out.println(i);
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		PrimeNumber p=new PrimeNumber();
		p.display(num);
	}

}
