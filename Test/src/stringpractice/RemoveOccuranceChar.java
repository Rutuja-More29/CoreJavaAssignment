package stringpractice;

public class RemoveOccuranceChar {

		static void removeduplicateChar(char ch[],int n) {
			String a=" ";
			int j;
			for(int i=0;i<n;i++) {
				for( j=0;j<i;j++) {
					if(ch[i]==ch[j]) {
						break;
					}
				}
				if(j==i) {
					a=a+ch[i];
				}
			}
			System.out.print(a+" ");
		}
	public static void main(String[] args) {
		String s="Goodbetterbest";
		char ch[]=s.toCharArray();
		int n=ch.length;
	RemoveOccuranceChar.removeduplicateChar(ch, n);
		

	}

}
