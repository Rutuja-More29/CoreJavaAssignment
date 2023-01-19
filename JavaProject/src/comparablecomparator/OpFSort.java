package comparablecomparator;

import java.util.Comparator;

public class OpFSort implements Comparator<Faculty> {
	public int compare(Faculty f1,Faculty f2)
	{
		if(f1.dept.compareTo(f2.dept)==0)
		{
			if(f1.salary>f2.salary)
				return 1;
			else if(f1.salary<f2.salary)
				return -1;
			else
				return 0;
			
		}else
		{
			if(f1.id>f2.id)
			return 1;
			else if(f1.id<f2.id)
				return -1;
			else
				return 0;
		}
		
}
}