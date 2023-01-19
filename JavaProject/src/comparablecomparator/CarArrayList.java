package comparablecomparator;
import java.util.ArrayList;
import java.util.Collections;
public class CarArrayList {
		void setElement(ArrayList<Car>ac1)
		{
			ac1.add(new Car(111,"seltos","kia",2020,900000));
			ac1.add(new Car(145,"amaze","honda",2021,800000));
			ac1.add(new Car(211,"xc40","valvo",2012,7800000));
			ac1.add(new Car(311,"sedan","jaguar",2019,1560000));
			ac1.add(new Car(441,"seltospro","kia",2020,900000));
			
			
			
		}

	public static void main(String[] args) {
		ArrayList<Car> ac=new ArrayList<>();
		CarArrayList ca=new CarArrayList();
		Collections.sort(ac);
		ca.setElement(ac);
		System.out.println(ac);
		Collections.reverse(ac);
		System.out.println(ac);
	}

}
