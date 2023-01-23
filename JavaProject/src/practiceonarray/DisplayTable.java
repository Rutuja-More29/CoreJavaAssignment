package practiceonarray;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int a[]=new int[10];
		for(int i=1;i<a.length;i++)
		{
			a[i]=i*num;
		}
		System.out.println(Arrays.toString(a));

	}

}
