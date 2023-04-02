package augusttest;

import java.util.Arrays;

public class MergedArray {
	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int[] merged = new int[n1 + n2];
		int i = 0, j = 0, k = 0;

		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j]) {
				merged[k++] = arr1[i++];
			} else if (arr1[i] > arr2[j]) {
				merged[k++] = arr2[j++];
			} else {
				merged[k++] = arr1[i++];
				j++;
			}
		}

		while (i < n1) {
			merged[k++] = arr1[i++];
		}

		while (j < n2) {
			merged[k++] = arr2[j++];
		}

		// remove duplicates
		int[] result = new int[k];
		result[0] = merged[0];
		int last = merged[0];
		int index = 1;
		for (int m = 1; m < k; m++) {
			if (merged[m] != last) {
				result[index++] = merged[m];
				last = merged[m];
			}
		}

		return Arrays.copyOf(result, index);
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7, 8 };
		int[] merged = mergeArrays(arr1, arr2);
		System.out.println(Arrays.toString(merged));
	}

	
}
