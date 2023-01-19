package arraylistassignment;
import java.util.ArrayList;
public class NonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Math");
		al.add(50);
		al.add(40);
		al.add("India");
		for(Object o:al)
		{
			System.out.print(o+" ");
		}

	}

}
