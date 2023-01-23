package arraylistpractice;

public class EncryptionAlphabet {
	void display(String s)
	{
		int sum=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&& ch[i]<='Z')
			{
				sum=sum+(ch[i]-64);
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		String s="KITE";
		EncryptionAlphabet a=new EncryptionAlphabet();
		a.display(s);

	}

}
