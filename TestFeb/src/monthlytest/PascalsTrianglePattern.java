package monthlytest;

public class PascalsTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for(int i=0;i<row;i++) {
			for(int k=5;k>i;k--) {
				System.out.print(" ");
			}
			int num=1;
			for(int j=0;j<=i;j++) {
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			System.out.println();
		}
		

	}

}
