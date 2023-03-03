package comparatorcomparablepractice;

import java.util.Comparator;

public class CountryNameSort implements Comparator<Employees> {
	public int compare(Employees e1,Employees e2) {
		return e1.p.country.compareToIgnoreCase(e2.p.getCountry());
	}
}
