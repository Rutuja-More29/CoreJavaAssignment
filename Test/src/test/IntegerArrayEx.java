package test;

public class IntegerArrayEx {
	void alternatArray(int arr1[],int arr2[],int result[]) {
		int index=0;
		for(int i=0;i<arr1.length;i++) {
			result[index++]=arr1[i];
			result[index++]=arr2[i];
		}
		
		while(index<result.length) {
			if(index<result.length) {
				result[index++]=arr1[index-arr2.length];
			}
			else {
				result[index++]=arr2[index-arr2.length];
			}
		}
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,6,7,8};
		// 1,5 2,6,3,7,4,8
		int result[]=new int[arr1.length+arr2.length];
		
		IntegerArrayEx e=new IntegerArrayEx();
		e.alternatArray(arr1, arr2, result);

	}

}
