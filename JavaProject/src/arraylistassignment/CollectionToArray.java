package arraylistassignment;
import java.util.ArrayList;
public class CollectionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		Integer arr[]=new Integer[al.size()];
		/*	arr=al.toArray(arr);
		for(Integer i:arr)
		{
			System.out.print(i+" ");
		}*/
		//manually ArrayList to array
		for(int i=0;i<al.size();i++)
		
			arr[i]=al.get(i);
		for(Integer i:arr)
			System.out.print(i+" ");
	}

}
