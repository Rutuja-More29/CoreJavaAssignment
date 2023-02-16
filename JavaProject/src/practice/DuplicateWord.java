package practice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class DuplicateWord {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String str[]=s.split(" ");
		
		ArrayList<String>al=new ArrayList<>();
		for(int i=0;i<str.length;i++) {
			al.add(str[i]);
		}
		System.out.println(al);
		ArrayList<String>al1=new ArrayList<>();
		Iterator<String>itr=al1.iterator();
		while(itr.hasNext()) {
			if(itr.next().equalsIgnoreCase(s))
			{
				System.out.println(itr);
			}
		}
	}

}
