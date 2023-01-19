package practicestring;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
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
					System.out.println("Not Anagram");
					flag++;
					break;
				}
				
			}
			if(flag==1)
			{
				System.out.println("Anagram");
			}
		}
		else
		{
			System.out.println("not equals");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two string:");
		String s1=sc.next();
		String s2=sc.next();
		Anagram a= new Anagram();
		a.checkAnagram(s1, s2);
		
	}

}
