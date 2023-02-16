package stringarraypractice;

public class StringDigitSum {
	void sumOfDigit(String s)
	{
		int sum=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				sum=sum+s.charAt(i)-48;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		String s="java5java8";
		StringDigitSum sd=new StringDigitSum();
		sd.sumOfDigit(s);
		

	}

}
