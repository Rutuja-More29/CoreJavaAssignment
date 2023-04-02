package practicestring;

public class RemoveOccuranceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="GoodBetterBest";
		char ch[]=s.toCharArray();
		int n=ch.length;
		String a=" ";
		int j;
		for(int i=0;i<n;i++) {
			for( j=0;j<n;j++) {
				
				if(ch[i]==ch[j])
					break;
			}
			if(j==i) {
				a=a+ch[i];
			}
		}
		System.out.print(a+" ");
	}

}
