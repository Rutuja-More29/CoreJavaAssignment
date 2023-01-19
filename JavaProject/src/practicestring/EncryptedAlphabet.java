package practicestring;

import java.util.Arrays;

public class EncryptedAlphabet {
	void display(String s)
	{
		
		int sum=0;
		String str[]=s.split(" ");
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++)
		{
			char ch[]=str[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				sum=sum+(ch[j]-64);
			}
			System.out.println(str[i]+" : "+sum);
		}
		
		
	}

	public static void main(String[] args) {
		String s="THE SKY IS BLUE";
		EncryptedAlphabet a=new EncryptedAlphabet();
		a.display(s);

	}

}
