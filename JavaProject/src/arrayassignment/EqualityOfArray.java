package arrayassignment;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {
		int arr1[]= {12,22,32,42,52,62};
		int arr2[]= {52,22,62,12,42,22};
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Arrays are equals");
		}
		else
		{
			System.out.println("Arrays are not equals");
		}

	}

}
