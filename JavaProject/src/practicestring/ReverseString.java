package practicestring;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String s="java is easy to write and learn";
		String str[]=s.split(" ");
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
				System.out.print(str[i].charAt(j));
			}
			System.out.println();
		}
	}

}
