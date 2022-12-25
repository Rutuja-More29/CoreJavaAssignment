package arrayassignment;

public class SumOfRowColumn {
	void sumOfRow(int row,int cols,int a[][])
	{
		int sumRow;
		for(int i=0;i<row;i++)
		{
			sumRow=0;
		
		for(int j=0;j<cols;j++)
		{
			sumRow=sumRow+a[i][j];
		}
		System.out.println("Sum of"+(i+1)+"row:"+sumRow);
		}
	}
	void sumOfColumn(int row,int cols,int a[][])
	{
		int sumCol;
		for(int i=0;i<cols;i++)
		{
			sumCol=0;
			for(int j=0;j<row;j++)
			{
				sumCol=sumCol+a[j][i];
			}
			System.out.println("Sum of"+(i+1)+"column:"+sumCol);
		}
		
	}
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int row,clos;
		row=a.length;
		int cols=a[0].length;
		SumOfRowColumn s=new SumOfRowColumn();
		s.sumOfRow(row, cols, a);
		s.sumOfColumn(row, cols, a);

	}

}
