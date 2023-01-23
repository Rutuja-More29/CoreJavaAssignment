package practiceonarray;

import java.util.Arrays;

public class ReplaceNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 12, 3, -19, 29, 5, -34, 6 };
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				a[i] = a[i - 1] * a[i - 1];
				
			}
			System.out.print(a[i]+" ");
		}

	}

}
