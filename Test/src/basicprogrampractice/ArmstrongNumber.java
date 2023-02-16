package basicprogrampractice;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int leng=0;
		int t1=n;
		while(t1!=0) {
			leng=leng+1;
			t1=t1/10;
		}
		int t2=n;
		int arm=0;
		int r;
		while(t2!=0) {
			int mul=1;
			r=t2%10;
			for(int i=0;i<=leng;i++) {
				mul=mul*r;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==n) {
			System.out.println("Armstrong number"+n);
		}
		else
			System.out.println("not armstrong number"+n);

	}

}
