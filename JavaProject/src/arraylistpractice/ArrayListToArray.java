package arraylistpractice;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListToArray {
	void arrayList(ArrayList<Integer>al)
	{
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		Integer arr[]=new Integer[al.size()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=al.get(i);
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		ArrayListToArray a=new ArrayListToArray();
		a.arrayList(al);

	}

}
