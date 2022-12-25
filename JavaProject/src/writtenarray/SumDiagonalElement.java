package writtenarray;

public class SumDiagonalElement {

		void sumDiagonalElement(int matrix[][],int n)
		{
			int p=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i==j)
					{
						p=p+matrix[i][j];
					}
				}
			}
			System.out.println("Sum of  Diagonal:"+p);
		}
	public static void main(String[] args) {
		int b[][]= {{1,2,3},{5,6,7},{4,6,8}};
		SumDiagonalElement sde=new SumDiagonalElement();
		sde.sumDiagonalElement(b, 3);

	}

}
