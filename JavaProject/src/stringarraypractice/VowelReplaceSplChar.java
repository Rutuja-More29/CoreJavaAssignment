package stringarraypractice;

public class VowelReplaceSplChar {
	void replace(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				System.out.print('@'+" ");
			}
			else
			{
				System.out.print(ch[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		String  s="rutuja";
		VowelReplaceSplChar rs=new VowelReplaceSplChar();
		rs.replace(s);

	}

}
