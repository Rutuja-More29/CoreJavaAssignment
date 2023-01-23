package arraylistpractice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class FailFast {

	void check(ArrayList<Integer>al)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter number:");
			al.add(sc.nextInt());
		}
		Iterator <Integer>itr =al.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			if(i==10)
			{
				al.add(3);
			}
			
		}
		System.out.println(itr);
	}
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		FailFast f=new FailFast();
		f.check(al);
		

	}

}
