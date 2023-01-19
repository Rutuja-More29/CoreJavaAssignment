package practicearray;

import java.util.Arrays;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {3,90,45,29,37,78};
		int n=ar.length;
		int mid=n/2;
		for(int i=0;i<mid;i++)
		{
			int temp=ar[i];
			ar[i]=ar[n-1-i];
			ar[n-1-i]=temp;
			
		}
		System.out.println(Arrays.toString(ar));

	}

}
