package practicearray;

import java.util.Arrays;

public class ReverseUsingTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,11,23,45,67,1};
		int n=arr.length;
		int mid=n/2;
		for(int i=0;i<mid;i++) {
			
	
				int temp=arr[i];
				arr[i]=arr[n-1-i];
				arr[n-1-i]=temp;
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
