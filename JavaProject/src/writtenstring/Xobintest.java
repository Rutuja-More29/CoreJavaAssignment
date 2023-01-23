package writtenstring;

import java.util.Scanner;

public class Xobintest {
	public static boolean isdigitThree(int num)
	{
		boolean ispresent=false;
		while(num>0)
		{
			if(num%10==3)
			
				return true;
				num=num/10;
			
		}
		return ispresent;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		Xobintest x=new Xobintest();
		x.isdigitThree(num);
	//	System.out.println(ispresent);
		
	}

}
