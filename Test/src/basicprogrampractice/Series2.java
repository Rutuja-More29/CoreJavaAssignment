package basicprogrampractice;
//print series 0,1,3,6,10,15,21,28
import java.util.Scanner;
public class Series2 {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	int a=0;
	for(int i=0;i<=num;i++) {
		 a=a+i;
		System.out.println(a+" ");
	}
}
}
