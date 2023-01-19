package practicestring;
import java.util.Scanner;
public class CountNumFromString {
		void count(String s)
		{
			int count=0;
			char ch[]=s.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>='0' && ch[i]<='9')
				{
					count=count+(ch[i]-48);
				}
				
			}
			System.out.println(count);
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		CountNumFromString c=new CountNumFromString();
		c.count(s);
		
	}

}
