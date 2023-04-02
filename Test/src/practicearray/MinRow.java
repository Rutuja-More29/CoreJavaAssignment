package practicearray;

public class MinRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={ {22,31,9},{12,25,16}};
		
		for(int i=0;i<arr.length;i++) {
			int min=arr[i][0];
		for(int j=0;j<arr.length;j++) {	
			if(arr[i][j]<min)
			{
				min=arr[i][j];
			}
		}
		System.out.println("min  row "+min);
		}
		
		for(int i=0;i<arr.length;i++) {
			int max=arr[i][0];
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			System.out.println("max row"+max);
		}
	}

}
