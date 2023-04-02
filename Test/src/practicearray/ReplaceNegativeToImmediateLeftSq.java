package practicearray;

public class ReplaceNegativeToImmediateLeftSq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,3,-19,29,5,-61,44,7,-9};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				System.out.println((i-1)*(i-1));
			}
			else
				System.out.println(arr[i]);
		}

	}

}
