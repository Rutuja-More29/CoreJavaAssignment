package collectionpractice;

public class EncryptedAlphabet {

	public static void main(String[] args) {
		String s="KITE";
		int sum=0;
		char ch []=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z' )
				sum=sum+(ch[i]-64);
		}
		System.out.println(sum);
	}

}
