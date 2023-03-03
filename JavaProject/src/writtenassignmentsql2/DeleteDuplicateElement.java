package writtenassignmentsql2;

import java.util.Arrays;

public class DeleteDuplicateElement {
	static int[] removeDuplicate(int arr[]) {
		int temp[]=new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[arr.length-1];
		int []result=new int[j];
		for(int i=0;i<j;i++) {
			result[i]=temp[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,4,5,5,6};
	System.out.println("original array:"+Arrays.toString(arr));
	int [] result=removeDuplicate(arr);
	System.out.println("Array after removing duplicate:"+Arrays.toString(result));
	

	}

}
