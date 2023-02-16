package arraypractice;

public class DuplicateValueArray {
	void check(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {3,10,90,78,56,10,78,34,61};
		DuplicateValueArray d=new DuplicateValueArray();
		d.check(arr);

	}

}
