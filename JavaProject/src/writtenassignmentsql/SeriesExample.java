package writtenassignmentsql;
//input 10
//print series 5,13,25,41,61,85
import java.util.Scanner;

public class SeriesExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms in the series:");
		int n=sc.nextInt();
		
		for(int i=1;i<n;i++) {
			int a=(i*i)+((i-1)*(i-1));
			System.out.print(a+" ");
		}

	}

}
