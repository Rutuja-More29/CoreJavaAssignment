package practicestring;

public class VowelsAndConsonant {
	void check(String s)
	{
		String str=s.toLowerCase();
		int vowelcount=0;
		int consonantcount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vowelcount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				consonantcount++;
			}
		}
		System.out.println("vowels are:"+vowelcount);
		System.out.println("consonant are:"+consonantcount);
	}
	public static void main(String[] args) {
		String s="Java is object oriented language";
		VowelsAndConsonant vc=new VowelsAndConsonant();
		vc.check(s);

	}

}
