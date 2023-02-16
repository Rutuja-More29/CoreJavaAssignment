package arraypractice;

public class MaxInColumn {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,9,8}};
		for(int i=0;i<a.length;i++) {
			int max=a[0][i];
			for(int j=1;j<a[i].length;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
			System.out.println("max value in column:"+i+" "+max);
		}
		

	}

}
