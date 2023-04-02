package practicearray;

public class ArrangeNegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,-4,-2,6,-1};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
				System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
