package practice;
import java.util.Scanner;
public class Digit {
	void findDigit(int num)
	{	
		int digit=0;
		for(int i=0;i<=num;i++)
		{
			if(num!=0)
			{
				digit=num%10;
				num=num/10;
				
			}
			if(digit%2==0)
			{
				System.out.println(digit);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		Digit d=new Digit();
		d.findDigit(num);

	}

}
