package practicestring;

import java.util.Arrays;

public class SumDigitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java5seesion6";
		char str[]=s.toCharArray();
		int sum=0;
		//System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++)
		{
			if(str[i]>='0'&& str[i]<='9')
			{
				sum=sum+(str[i]-48);
			}
		}
		System.out.println(sum);

	}

}
