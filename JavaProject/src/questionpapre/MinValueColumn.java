package questionpapre;

public class MinValueColumn {
	void minValue(int a[][])
	{
		for(int i=0;i<a.length;i++) {
			int min=Integer.MAX_VALUE;
			for(int j=0;j<a[i].length-1;j++) {
				if(a[j][i]<min)
					min=a[j][i];
			}
			System.out.println("min column value:"+i+"= "+min);
		}
	}
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,3,6}};
		MinValueColumn m=new MinValueColumn();
		m.minValue(a);

	}

}
