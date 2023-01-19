package practicearray;
import java.util.Arrays;
import java.util.Scanner;
public class TableNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=i*num;
		}
		System.out.println(Arrays.toString(arr));
	}

}
