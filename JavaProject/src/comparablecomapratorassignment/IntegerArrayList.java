package comparablecomapratorassignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class IntegerArrayList {
	void Element(ArrayList<Integer>a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		System.out.println("Enter number of element:");
		for(int i=0;i<size;i++)
		{
			a.add(sc.nextInt());
		}
		
		
	}
	void sortAscending(ArrayList<Integer>al1)
	{
		Collections.sort(al1);
	}
	void sortDescending(ArrayList<Integer>al2)
	{
		Collections.sort(al2);
		Collections.reverse(al2);
	}
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		
		IntegerArrayList ail=new IntegerArrayList();
		ail.Element(al);
		System.out.println("original arraylist:"+al);
		
		ail.sortAscending(al);
		System.out.println("Ascending arraylist:"+al);
		
		ail.sortDescending(al);
		System.out.println("Descending arraylist:"+al);

	}

}
