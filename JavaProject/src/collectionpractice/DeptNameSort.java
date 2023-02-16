package collectionpractice;

import java.util.Comparator;

public class DeptNameSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
	
		return o1.getDept().compareToIgnoreCase(o2.getDept());
		

	
	}

}
