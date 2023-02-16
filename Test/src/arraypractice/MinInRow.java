package arraypractice;

public class MinInRow {

	public static void main(String[] args) {
		int a[][]={ {22,31,9},{12,25,16}};
		for(int i=0;i<a.length;i++) {
			int min=a[i][0];
			for(int j=1;j<a[i].length;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
				}
			}
			System.out.println("min value in row:"+i+" "+min);
		}

	}

}
