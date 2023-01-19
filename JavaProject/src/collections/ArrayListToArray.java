package collections;
import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Object arr[]=al.toArray();    // ArrayList to Object
		
		Integer arr1[]=new Integer[al.size()];
		al.toArray(arr);        // ArrayList to Specified wrapper type
		
		int ar[]=new int[al.size()];   // for primitive not use directly method
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=al.get(i);
			System.out.print(ar[i]+" ");
		}
		

	}

}
