package questionpapre;
//WAP to display sum of both diagonals of 4X4 matrix
public class SumOfDiagonal {
	void sumOfDiagonal(int b[][],int n)
	{
		int pCount=0,sCount=0;
		for(int k=0;k<n;k++) {
			for(int j=0;j<n;j++) {
				if(k==j)
					pCount=pCount+b[k][j];
				if((k+1)==(n-1))
					sCount=sCount+b[k][j];
			}
		}
		System.out.println("Sum of principle Diagonal element:"+pCount);
		System.out.println("Sum of Secondary diagonal element:"+sCount);
	}

	public static void main(String[] args) {
		int b[][]= {{8,2,13,4},{9,4,15,3},{1,3,5,18},{19,6,7,1}};
				
		SumOfDiagonal s=new SumOfDiagonal();
		s.sumOfDiagonal(b, 4);

	}

}
