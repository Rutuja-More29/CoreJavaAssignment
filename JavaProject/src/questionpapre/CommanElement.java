package questionpapre;

public class CommanElement {

	public static void main(String[] args) {
		int arr[]= {4,23,10,8,12,32,9};
		int arr2[]= {9,25,14,23,55,43,12,22};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr[i]==arr2[j])
					System.out.println(arr2[j]);
			}
		}

	}

}
