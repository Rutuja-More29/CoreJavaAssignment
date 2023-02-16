package questionpapre;
import java.util.Scanner;
public class IntegerArray {
public static void main(String[] args) {
	int a[]= {4,2,5,7,8,2,9};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int x=sc.nextInt();
	boolean val=false;
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]!=x) {
			count++;
		}
		else {
			val=true;
		}
	}
	if(val) {
		int b[]=new int[count];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=x) {
				b[j]=a[i];
				j++;
			}
		}
	
	System.out.println("the array without num:"+x+"is;");
	for(int i=0;i<b.length;i++) {
		System.out.println(b[i]+" ");
	}
	}
	else {
		System.out.println("the num:"+x+"not found in array");
	}
}
}
