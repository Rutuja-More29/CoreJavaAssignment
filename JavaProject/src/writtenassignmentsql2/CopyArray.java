package writtenassignmentsql2;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdefg";
		String s2="1234";
		char ch[]=s1.toCharArray();
		char ch1[]=s2.toCharArray();
		for(int i=0;i<s1.length();i++) {
			if(i<s1.length()&& i<s2.length())
			{
				System.out.print(ch[i]);
				System.out.print(ch1[i]);
				
			}
			else
				System.out.print(ch[i]);
		}
		

	}

}
