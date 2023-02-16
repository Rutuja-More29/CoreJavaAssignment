package stringarraypractice;

public class Replace1st {

	public static void main(String[] args) {
		String s="rutuja";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==s.charAt(0))
			{
				System.out.print('@'+" ");
			}
			else
				System.out.print(ch[i]+" ");
		}
		System.out.println();
		
		
			
	

	}

}
