package comparablecomapratorassignment;
import java.util.Comparator;
public class ArrayListNameSort implements Comparator<Empdep> {
	public int compare(Empdep e1,Empdep e2)
	{
		return e1.dept.compareTo(e2.dept);
	}
}
