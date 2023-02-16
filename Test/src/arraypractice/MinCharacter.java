package arraypractice;

public class MinCharacter {
	void check(char ch[]) {
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length-1;j++) {
				if(ch[j]>ch[j+1]) {
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		System.out.println(ch[0]);
	}

	public static void main(String[] args) {
	char ch[]= {'A','B','C','x','z','R'};
	MinCharacter m=new MinCharacter();
	m.check(ch);

	}

}
