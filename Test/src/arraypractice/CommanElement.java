package arraypractice;

public class CommanElement {
	void check(int arr[],int arr2[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr[i]==arr2[j]) {
					System.out.print(arr2[j]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {12,23,34,67,78,91,56};
		int arr2[]= {39,25,15,23,55,91,66,22};
		CommanElement c=new CommanElement();
		c.check(arr, arr2);

	}

}
