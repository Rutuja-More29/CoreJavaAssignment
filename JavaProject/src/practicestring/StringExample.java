package practicestring;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		String s="Rutuja";
		String s1=s.toLowerCase();
		char ch[]=s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' ||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				System.out.print('@'+" ");
			}
			else 
			{
				System.out.print(ch[i]+" ");
			}
		}
		
		
		
		
		}

	}


