package arrayassignment;

public class SquareNumArray {

	public static void main(String[] args) {
		int a[]= {23,43,25,49,12,9,78,66,39,0};
		for(int i=0;i<a.length;i++)
		{
			double sqrt=Math.sqrt(a[i]);
			if(sqrt==Math.floor(sqrt))
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();

	}

}
