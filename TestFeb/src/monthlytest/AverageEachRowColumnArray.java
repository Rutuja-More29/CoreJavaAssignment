package monthlytest;

public class AverageEachRowColumnArray {
	public static void main(String[] args) {
		int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		double rowsum=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
			rowsum=rowsum+matrix[i][j];
			
		}
			double rowAvg=rowsum/matrix[i].length;
			System.out.println("row"+i+" avg :" +rowAvg);
	}
		for(int j=0;j<matrix[0].length;j++) {
			double colsum=0;
			for(int i=0;i<matrix.length;i++) {
				colsum=colsum+matrix[i][j];
			}
			double colAvg=colsum/matrix.length;
			System.out.println("column"+j+"avg"+colAvg);
		}
	
	}
}
