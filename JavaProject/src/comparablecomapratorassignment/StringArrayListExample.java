package comparablecomapratorassignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class StringArrayListExample {
	void setElement(ArrayList<String>s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		System.out.println("Enter no.of string:");
		for(int i=0;i<size;i++)
		{
			s.add(sc.next());
		}
	}
	void sortAscending(ArrayList<String>s1)
	{
		Collections.sort(s1);
	}
	void sortDescending(ArrayList<String>s2)
	{
		Collections.sort(s2);
		Collections.reverse(s2);
	}
	public static void main(String[] args) {
		ArrayList<String> as=new ArrayList<>();
		StringArrayListExample sl=new StringArrayListExample();
		sl.setElement(as);
		System.out.println("original :"+as);
		
		sl.sortAscending(as);
		System.out.println("Ascending:"+as);
		sl.sortDescending(as);
		System.out.println("Descending:"+as);
		

	}

}
