package stringpractice;

import java.util.Scanner;

public class CountOccuranceWord {
	static int count(String s,String s1) {
		int count=0;
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++) {
			if(s1.equals(a[i])) {
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		System.out.println("Enter word:");
		String s1=sc.next();
		
		System.out.println(CountOccuranceWord.count(s, s1));
		

	}

}
