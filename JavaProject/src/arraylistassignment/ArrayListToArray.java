package arraylistassignment;
import java.util.ArrayList;
public class ArrayListToArray {
	void setArrayList(ArrayList<Integer>al)
	{
		al.add(10);
		al.add(20);
		al.add(60);
		al.add(50);
		al.add(40);
		Integer arr[]=new Integer[al.size()];
		for(int i=0;i<al.size();i++)
		{
			arr[i]=al.get(i);
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayListToArray ail=new ArrayListToArray();
		ail.setArrayList(al);
		
	}

}
