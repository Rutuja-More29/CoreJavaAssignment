package arraypractice;

public class MaxInRow {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++) {
			int max=a[i][0];
			for(int j=1;j<a[i].length;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
			System.out.println("max value in row:"+i+" "+max);
		}
				
		

	}

}
