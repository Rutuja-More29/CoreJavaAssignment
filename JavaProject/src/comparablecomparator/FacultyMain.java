package comparablecomparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class FacultyMain {
	void setElement(ArrayList<Faculty>af1)
	{
		af1.add(new Faculty(111,"abhi","physics","science",56000));
		af1.add(new Faculty(411,"amay","em","civil",50000));
		af1.add(new Faculty(131,"amit","geography","art",76000));
		af1.add(new Faculty(616,"rita","java","comp",66000));
		af1.add(new Faculty(991,"shiksha","dom","mech",56000));
		af1.add(new Faculty(686,"yash","physics","science",86000));
		af1.add(new Faculty(110,"diksha","chem","science",59000));
		
	}

	public static void main(String[] args) {
	ArrayList<Faculty> af=new ArrayList<>();
	FacultyMain fm=new FacultyMain();
	Collections.sort(af, new OpFSort());
	System.out.println(af);

	}

}
