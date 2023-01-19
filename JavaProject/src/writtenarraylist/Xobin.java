package writtenarraylist;
import java.util.ArrayList;
public class Xobin {

	public static void main(String[] args) {
		ArrayList<Integer>al =new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(4);
		al.add(5);
		ArrayList<Integer> al1=new ArrayList<>();
		for(Integer i:al)
		{
			if(!al1.contains(i));
			{
				al1.add(i);
			}
		}
		System.out.println(al1);

	}

}
