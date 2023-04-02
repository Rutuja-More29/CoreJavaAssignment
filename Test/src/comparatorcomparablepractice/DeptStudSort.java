package comparatorcomparablepractice;

import java.util.Comparator;

public class DeptStudSort  implements Comparator<Stud>{

	@Override
	public int compare(Stud o1, Stud o2) {
		// TODO Auto-generated method stub
		return o1.getDept().compareToIgnoreCase(o2.getDept());
	}

}
