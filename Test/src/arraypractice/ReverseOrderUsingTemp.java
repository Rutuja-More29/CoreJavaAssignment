package arraypractice;

import java.util.Arrays;

public class ReverseOrderUsingTemp {
	void display(int a[]) {
		int n=a.length;
		int mid=n/2;
		for(int i=0;i<mid;i++) {
			int temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int a[]= {10,30,5,80,97,6};
		ReverseOrderUsingTemp r=new ReverseOrderUsingTemp();
		r.display(a);

	}

}
