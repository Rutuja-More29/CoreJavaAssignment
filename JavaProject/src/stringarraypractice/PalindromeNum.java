package stringarraypractice;
import java.util.Scanner;
public class PalindromeNum {
	void check(int num)
	{
		int r,sum=0;
		int temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		PalindromeNum p=new PalindromeNum();
		p.check(num);

	}

}
