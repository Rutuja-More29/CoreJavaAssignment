package practicestring;

public class CountConsonantAndVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="BlueSky";
		char ch[]=s.toCharArray();
		int vcount = 0;
		int Ccount = 0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'||ch[i]=='u' || ch[i]=='A'|| ch[i]=='E'|| ch[i]=='I'|| ch[i]=='O'||ch[i]=='U')
			{
				vcount++;
			} else if(ch[i]>='A'&& ch[i]<='Z'|| ch[i]>='a'&& ch[i]<='z') {
				Ccount++;
			}
		}
		System.out.println("Vowel:"+vcount);
		System.out.println("Consonant:"+Ccount);

	}

}
