package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class IntegerArrayList {
	void setElement(ArrayList<Integer>al1)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		System.out.println("Enter  no of element:");
		for(int i=0;i<size;i++)
		{
			al1.add(sc.nextInt());
		}
	}
	void sortElement(ArrayList<Integer>al1)
	{
		Collections.sort(al1);
		Collections.reverse(al1);
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		IntegerArrayList ial=new IntegerArrayList();
		ial.setElement(al);
		System.out.println(al);
		ial.sortElement(al);
		System.out.println(al);
	}
}
