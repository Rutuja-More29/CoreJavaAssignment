package practicearray;

public class MinCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'A','D','E','x','R','Z','p'};
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
		System.out.println("Max char:"+ch[ch.length-1]);
	}

}
