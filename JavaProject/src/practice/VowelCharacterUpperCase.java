package practice;

import java.util.Scanner;

public class VowelCharacterUpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.replace('a', 'A');
		s=s.replace('e', 'E');
		s=s.replace('i', 'I');
		s=s.replace('o', 'O');
		s=s.replace('u', 'U');
		System.out.println(s);

	}

}
