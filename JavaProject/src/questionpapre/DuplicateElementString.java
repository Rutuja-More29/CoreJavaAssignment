package questionpapre;
import java.util.Scanner;
public class DuplicateElementString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equalsIgnoreCase(str[j]))
					System.out.print(str[j]+" ");
			}
		}

	}

}
