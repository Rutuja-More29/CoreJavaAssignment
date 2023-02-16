package arraypractice;

import java.util.Arrays;

public class SwapArray {
	void check(int a[]) {
		int n=a.length;
		int mid=n/2;
		for(int i=0;i<mid;i++) {
			int temp=a[i];
			a[i]=a[mid+i];
			a[mid+i]=temp;
		}
		System.out.print(Arrays.toString(a));
	}
	public static void main(String[] args) {
		int a[]= {2,4,9,0};
		SwapArray s=new SwapArray();
		s.check(a);
	}

}
