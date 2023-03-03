package stringarraypractice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		int temp,rev = 0,remainder;
		temp=num;
		while(num>0) {
			remainder=num%10;
			rev=(rev*10)+remainder;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");
	}

}
