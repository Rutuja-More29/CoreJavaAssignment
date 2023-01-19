package practicestring;
import java.util.Scanner;
public class CountOccuranceCharacter {
		void count(String str)
		{
			int count=0;
			char ch[]=str.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>='A' || ch[i]<='Z')
				{
					count=count+(ch[i]-64);
				}
				
			}
			System.out.println(count);
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.next();
		CountOccuranceCharacter c=new CountOccuranceCharacter();
		c.count(str);
		
	}

}
