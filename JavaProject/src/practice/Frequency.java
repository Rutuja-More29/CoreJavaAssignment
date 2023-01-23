package practice;
import java.util.Scanner;
public class Frequency {
	void checkFrequency(int num)
	{
		int count=0;
		int digit,temp;
		temp=num;
		for(int i=0;i<=num;i++) {
		while(temp>0)
		{
			digit=temp%10;
			if(digit==i)
			{
				count++;
			}
			temp=temp/10;
			
		}
		if(count>0)
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		Frequency f=new Frequency();
		f.checkFrequency(num);

	}

}
