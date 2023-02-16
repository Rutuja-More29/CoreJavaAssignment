package TwoDArray;

import java.util.Scanner;

public class DuplicateCharacterString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		char str[]=s.toCharArray();
		for(int i=0;i<str.length;i++)
		{
			
			for(int j=i+1;j<str.length;j++)
			{
				if (str[i]==str[j] )
				{
					System.out.println(str[j]);
					break;
					
					
				}
			
			}
			
		}

	}

}
