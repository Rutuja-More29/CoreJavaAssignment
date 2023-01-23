package arraylistpractice;
import java.util.ArrayList;
public class HeterogeneousElement {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add("10");
		al.add(100);
		al.add("sunday");
		System.out.println(al);
		for(Object o:al)
		{
			String s=o.getClass().getSimpleName();
			if(s.equalsIgnoreCase("Integer"))
			{
				System.out.println(o);
			}
		}

	}

}
