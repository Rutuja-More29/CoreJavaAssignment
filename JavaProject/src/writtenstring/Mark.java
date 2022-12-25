package writtenstring;

import java.util.Scanner;

public class Mark {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no.of subject:");
		int n=sc.nextInt();
		int marks[]=new int[n];
		System.out.println("Enter subject marks:");
		for(int i=0;i<n;i++)
		{
			  
				marks[i]=sc.nextInt();
		}
		System.out.println("Marks:"+marks);
		
	}

}
