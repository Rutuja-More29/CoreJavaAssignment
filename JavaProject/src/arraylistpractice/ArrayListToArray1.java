package arraylistpractice;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListToArray1 {
	void arraylistConvertArray(ArrayList<String>al) {
		al.add("sum");
		al.add("mon");
		al.add("tue");
		al.add("wed");
		al.add("thur");
		String s[]=new String[al.size()];
		for(int i=0;i<s.length;i++)
		{
			s[i]=al.get(i);
			
		}
		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args) {
		ArrayList <String>al=new ArrayList<>();
		ArrayListToArray1 a=new ArrayListToArray1();
		a.arraylistConvertArray(al);
		

	}

}
