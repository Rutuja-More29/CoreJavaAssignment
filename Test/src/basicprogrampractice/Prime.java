package basicprogrampractice;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int i=2;
		int mid=num/2;
		while(i<=mid) {
			if(num%i==0) {
				break;
			}
			i++;
		}
		if(i>mid) {
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
