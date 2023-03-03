package basicprogrampractice;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alphabet=65;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(5-i);k++) {
				System.out.print((char)(alphabet+k)+" ");
			}
			System.out.println();
		}

	}

}
