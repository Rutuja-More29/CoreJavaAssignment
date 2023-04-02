package monthlytest;

public class AlternateNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,6,7,8};
		int result[]=new int[arr1.length+arr2.length];
		int index=0;
		for(int i=0;i<arr1.length  ;i+=4) {
			result[index++]=arr1[i];
		}
		for(int i=0;i<arr1.length  ;i++) {
			result[index++]=arr2[i];
			}
		 
		while(index<result.length) {
			if(index<result.length) {
				result[index++]=arr1[index-arr2.length-1];
			}else
			{
				result[index++]=arr2[index-arr1.length-1];
			}
		}
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
			
		}
	}

}
