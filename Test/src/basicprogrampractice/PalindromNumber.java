package basicprogrampractice;
import java.util.Scanner;
public class PalindromNumber {
	void palindromedisplay(int num) {
		int sum=0;int temp,r;
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+(r);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		PalindromNumber p= new PalindromNumber();
		p.palindromedisplay(num);
	}

}
