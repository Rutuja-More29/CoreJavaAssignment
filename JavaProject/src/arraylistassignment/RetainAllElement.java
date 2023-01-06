package arraylistassignment;
import java.util.ArrayList;
public class RetainAllElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		al.add(50);
		al.add(100);
		al.add(150);
		al.add(200);
		System.out.println("original:"+al);
		
		
		ArrayList<Integer>al2=new ArrayList<>();
		al2.add(100);
		al2.add(300);
		al2.add(200);
		al2.add(400);
		System.out.println("original:"+al2);
		al2.retainAll(al);
		System.out.println(al2);

	}

}
