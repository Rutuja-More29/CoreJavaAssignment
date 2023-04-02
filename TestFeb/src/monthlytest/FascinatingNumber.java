package monthlytest;

import java.util.Scanner;

public class FascinatingNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3digit number:");
		int num=sc.nextInt();
		if(num<100||num>999) {
			System.out.println("invalid input number must be 3digit long");
			return;
		}
		int num2=num*2;
		int num3=num*3;
		String concatstr=num+""+num2+num3;
		boolean found =true;
		for(char c='1';c<='9';c++) {
			int count=0;
			for(int i=0;i<concatstr.length();i++) {
				char ch=concatstr.charAt(i);
				if(ch==c) {
					count++;
				}
				if(count>1||count==0) {
					found =false;
							break;
				}
			}
			
		}
		if(found) {
			System.out.println(num+" fascinating number");
		}
		else
		{
			System.out.println(num+" not fascinating number");
		}
	}
}