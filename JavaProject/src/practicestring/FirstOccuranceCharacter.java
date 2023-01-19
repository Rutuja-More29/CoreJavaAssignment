package practicestring;
import java.util.Scanner;
public class FirstOccuranceCharacter {
	
	public static void main(String[] args) {
		String firstchar;
		char ch;
		int i=0,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		firstchar=sc.nextLine();
		System.out.println("Enter the character to find:");
		ch=sc.next().charAt(i);
		for(i=0;i<firstchar.length();i++)
		{
			if(firstchar.charAt(i)==ch)
			{
				System.out.println(i);
				break;
			}
		}
		
	}

}
