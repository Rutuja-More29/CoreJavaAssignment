package stringassignment;

public class CountTotalWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Haveaniceday";
		char[] str=s.toCharArray();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(str[i]>='0'&& str[i]<='9')
			{
				sum=sum+s.charAt(i);
			}
			
		}
		System.out.print(sum);
	}

}
