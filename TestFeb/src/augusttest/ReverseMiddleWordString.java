package augusttest;
//given a string str,print reverse all word except the first and last words
//hi how are you student  ,i am fine
import java.util.Scanner;
public class ReverseMiddleWordString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		String str[]=s.split(" ");
		int n= str.length;
		if(n<=2) {
			System.out.println(s);
		}
		int middle= n/2;
		if(n%2==0) {
			middle--;
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) {
			if(i==middle) {
				sb.append(new StringBuilder(str[i]).reverse());
			}else {
				sb.append(str[i]);
			}
			if( i!=n-1) {
				sb.append(" ");
		}
		
		}
		System.out.println(sb.toString());
		
	
		/*String s="i am fine";
		String result=reverseMiddleWord(s);
		System.out.println(result);*/
		
	}

	
	

}
