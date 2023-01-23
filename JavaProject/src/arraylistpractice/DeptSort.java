package arraylistpractice;

import java.util.Comparator;

public class DeptSort implements Comparator<CEmployee> {
	public int compare(CEmployee e1, CEmployee e2) {
		return e1.getDept().compareToIgnoreCase(e2.getDept());
	}

}
