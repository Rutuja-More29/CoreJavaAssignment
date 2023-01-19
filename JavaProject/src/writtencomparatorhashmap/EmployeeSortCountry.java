package writtencomparatorhashmap;

import java.util.Comparator;

public class EmployeeSortCountry implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.p.country.compareTo(o2.p.country);
	}
}
