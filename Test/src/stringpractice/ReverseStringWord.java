package stringpractice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		String[] str=s.split(" ");
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++) {
			for(int j=str[i].length()-1;j>=0;j--) {
				System.out.print(str[i].charAt(j)+" ");
			}
		}
	}

}
