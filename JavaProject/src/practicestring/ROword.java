package practicestring;

import java.util.Arrays;

public class ROword {

	public static void main(String[] args) {
		String s="core java advance java session";
		String s2=" ";
		String str[]=s.split(" ");
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equalsIgnoreCase("java"))
			{
				continue;
			}
			else
			{
				System.out.println(str[i]);
			}
		}

	}

}
