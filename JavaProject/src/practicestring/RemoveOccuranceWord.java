package practicestring;

import java.util.Arrays;

public class RemoveOccuranceWord {

	public static void main(String[] args) {
		String s="core java advance java session java";
		String str[]=s.split(" ");
		System.out.println(Arrays.toString(str));
		String s1[]=new String[str.length-1];
		String s2=" ";
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equalsIgnoreCase("java"))
			{
				continue;
			}
			else
			{
				s2=s2+str[i]+" ";
			}
		}
		System.out.println(s2);
		

	}

}
