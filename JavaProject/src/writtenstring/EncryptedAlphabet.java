package writtenstring;

import java.util.Arrays;

public class EncryptedAlphabet {

	public static void main(String[] args) {
		String s1="THE SKY IS THE LIMIT"; // KITE
		String s2[]=s1.split(" ");
		System.out.println(Arrays.toString(s2));
		int sum=0;
		for(int i=0;i<s2.length;i++)
		{
			char ch[]=s2[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				int a=ch[j]-64;
				sum=sum+a;
			}
			System.out.println(s2[i]+":"+sum);
		}
		
	}

}
