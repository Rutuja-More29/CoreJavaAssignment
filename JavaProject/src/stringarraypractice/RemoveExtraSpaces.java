package stringarraypractice;

import java.util.Scanner;

public class RemoveExtraSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=s.replaceAll("\\s+", " ").trim();
		System.out.println(str);

	}

}
