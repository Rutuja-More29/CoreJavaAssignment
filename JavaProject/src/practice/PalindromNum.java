package practice;
import java.util.Scanner;
public class PalindromNum {
	void checkPalindrome(int num)
	{
		int temp,sum=0,r;
		temp=num;
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
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		PalindromNum p= new PalindromNum();
		p.checkPalindrome(num);

	}

}
