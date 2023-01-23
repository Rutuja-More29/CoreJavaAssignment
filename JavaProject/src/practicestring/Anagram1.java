package practicestring;

import java.util.Arrays;

public class Anagram1 {
	void checkAnagram(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
			char a[]=s1.toCharArray();
			char b[]=s2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			int flag=1;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					System.out.println("not anagram");
					flag++;
					break;
				}
			
			}
			if(flag==1)
			{
				System.out.println("anagram");
			}
		}
		else
		{
			System.out.println("not");
		}
	}

	public static void main(String[] args) {
		String s1="world";
		String s2="dlrow";
		Anagram1 a=new Anagram1();
		a.checkAnagram(s1, s2);

	}

}
