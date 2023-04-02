package practicearray;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,9,0};
		int n=arr.length;
		int mid=n/2;
		for(int i=0;i<mid;i++) {
			int temp=arr[i];
			arr[i]=arr[mid+i];
			arr[mid+i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
