package basicprogrampractice;
//WAP to print following series 5,13,25,41,61,85
import java.util.Scanner;
public class SeriesExample {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	for(int i=2;i<=num;i++) {
		int a=(i*i)+((i-1)*(i-1));
		System.out.print(a+" ");
	}

	}

}
