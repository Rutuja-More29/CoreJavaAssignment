package comparatorcomparablepractice;
import java.util.ArrayList;
import java.util.Collections;
public class CarMain {

		void setArraylist(ArrayList<Car>ac) {
			Car c1=new Car();
			c1.setId(111);
			c1.setName("audi");
			c1.setPrice(89000);
			c1.setLyear(2010);
			c1.setBrandname("abcd");
			ac.add(c1);
			
			Car c2=new Car();
			c2.setId(122);
			c2.setName("seltos");
			c2.setPrice(56000);
			c2.setLyear(2011);
			c2.setBrandname("kia");
			ac.add(c2);
			
			
			Car c3=new Car();
			c3.setId(144);
			c3.setName("amaze");
			c3.setPrice(780000);
			c3.setBrandname("honda");
			c3.setLyear(1999);
			ac.add(c3);
		}
		void sortlist(ArrayList<Car>ac) {
			Collections.sort(ac);
		}
		void reverselist(ArrayList<Car>ac) {
			Collections.reverse(ac);
		}
	public static void main(String[] args) {
		ArrayList<Car>ac=new ArrayList<>();
		CarMain cm=new CarMain();
		cm.setArraylist(ac);
		cm.sortlist(ac);
		System.out.println(ac);
		cm.reverselist(ac);
		System.out.println(ac);
	}

}
