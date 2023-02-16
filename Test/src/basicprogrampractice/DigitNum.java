package basicprogrampractice;
import java.util.Scanner;
public class DigitNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int digit=0;
		/*for(int i=0;i<num;i++) {
			if(num!=0) {
				digit=num%10;
				num=num/10;
			}
			if(digit%2==0) {
				System.out.println(digit);
			}
		}*/
		// using while loop
		while(num>0) {
			if(num!=0) {
				digit=num%10;
				num=num/10;
			}
			if(digit%2==0) {
				System.out.println(digit);
			}
		}
	}

}
