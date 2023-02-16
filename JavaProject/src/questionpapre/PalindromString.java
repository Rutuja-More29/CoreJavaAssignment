package questionpapre;
import java.util.Scanner;
public class PalindromString {
	void check(String s) {
		String rev="";
		int length=s.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+(s.charAt(i));
		}
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println(rev+" "+"palindrom");
		}
		else
		{
			System.out.println(rev+" "+"not palindrom");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		PalindromString p=new PalindromString();
		p.check(s);

	}

}
