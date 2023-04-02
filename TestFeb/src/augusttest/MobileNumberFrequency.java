package augusttest;

import java.util.Scanner;

public class MobileNumberFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a mobile number:");
		String num= sc.nextLine();
		int freq[]=new int[10];
		
		for(int i=0;i<num.length();i++) {
			char digit=num.charAt(i);
			if(Character.isDigit(digit)) {
				freq[digit-'0']++;
			}
		}
		System.out.println("Frequency of each digit in the mobile number");
		for(int i=0;i<10;i++) {
			System.out.println("digit"+i+" :"+freq[i]);
		}
	}

}
