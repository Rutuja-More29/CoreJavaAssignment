package basicprogrampractice;

public class AlphabetPattern {

	public static void main(String[] args) {
		int alphabet=65;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		//downward 
		for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print((char)(alphabet+j));
			}
			System.out.println();
		}
		System.out.println();
		for(int i=5;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alphabet+i)+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=5-1;i>=0;i--) {
			for(int j=5-1;j>=i;j--) {
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
