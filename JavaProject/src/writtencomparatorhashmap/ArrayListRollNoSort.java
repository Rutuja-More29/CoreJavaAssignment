package writtencomparatorhashmap;

import java.util.Comparator;

public class ArrayListRollNoSort implements Comparator<Student>{
	public int compare(Student s1,Student s2)
	{
		if(s1.rollno>s2.rollno)
			return 1;
		else if(s1.rollno<s2.rollno)
			return -1;
		else
			return 0;
	}

}
