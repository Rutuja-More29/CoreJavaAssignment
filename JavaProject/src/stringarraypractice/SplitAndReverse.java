package stringarraypractice;

import java.util.Arrays;

public class SplitAndReverse {

	public static void main(String[] args) {
		String s="HELLO@WORLD";
		String str[]=s.split("@");
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++)
		{
			for(int j=str[i].length()-1;j>i;j--)
			{
				System.out.print(str[i].charAt(j)+" ");
			}
		}
		//for

	}

}
