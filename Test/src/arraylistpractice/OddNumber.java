package arraylistpractice;
import java.util.ArrayList;
import java.util.Iterator;
public class OddNumber {
	void oddNum(ArrayList<Integer>al) {
		for(int i=0;i<=50;i++) {
			al.add(i);
		}
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		OddNumber o=new OddNumber();
		o.oddNum(al);

	}

}
