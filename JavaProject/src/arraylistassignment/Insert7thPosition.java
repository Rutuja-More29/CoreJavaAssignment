package arraylistassignment;
import java.util.ArrayList;
public class Insert7thPosition {
	void arrayList(ArrayList<Integer>ai)
	{
		ai.add(1);
		ai.add(2);
		ai.add(3);
		ai.add(4);
		ai.add(5);
		ai.add(6);
		ai.add(7);
		ai.add(8);
		ai.add(9);
		ai.add(10);
		System.out.print(ai+" ");
		System.out.println();
		ai.add(7, 12);
		System.out.print(ai+" ");
	}
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		Insert7thPosition i=new Insert7thPosition();
		i.arrayList(al);

	}

}
