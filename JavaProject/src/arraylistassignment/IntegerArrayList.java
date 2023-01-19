package arraylistassignment;
import java.util.ArrayList;
import java.util.Scanner;
public class IntegerArrayList {
	void arrayList(ArrayList<Integer>al)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		System.out.println("Enter element:");
		for(int i=0;i<size;i++)
		{
			al.add(sc.nextInt());
		}
		for(Integer i:al)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	IntegerArrayList ial=new IntegerArrayList();
	ial.arrayList(al);
	

	}

}
