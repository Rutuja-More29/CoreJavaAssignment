package writtenstring;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
	public static boolean checkAnagram(String first,String second)
	{
		boolean isAnagram=false;
		if(first.length()==second.length())
		{
			char a[]=first.toCharArray();
			char b[]=second.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					isAnagram=false;
				}
				else
				{
					isAnagram=true;
				}
			}
		}
		else
		{
			isAnagram=false;
		}
		return isAnagram;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String first=sc.next();
		String second=sc.next();
		Anagram a=new Anagram();
		Boolean isAnagram= a.checkAnagram(first,second);
		System.out.println(isAnagram);

	}

}
