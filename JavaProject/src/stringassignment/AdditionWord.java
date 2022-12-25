package stringassignment;
import java.util.Scanner;
public class AdditionWord {
	void addWord(String s)
	{
		int sum=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			
			if(ch[i]>='A'&& ch[i]<='K')
			{
				 sum=sum+(ch[i]-64);
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		AdditionWord a=new AdditionWord();
		a.addWord(s);

	}

}
