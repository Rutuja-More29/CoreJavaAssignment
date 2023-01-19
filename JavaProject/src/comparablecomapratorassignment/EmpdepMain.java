package comparablecomapratorassignment;
import java.util.ArrayList;
import java.util.Collections;
public class EmpdepMain {
	void setArrayList(ArrayList<Empdep>empd)
	{
		empd.add(new Empdep(122,"sana","prod"));
		empd.add(new Empdep(344,"rita","dev"));
		empd.add(new Empdep(566,"sita","tes"));
		empd.add(new Empdep(347,"gau","sales"));
		empd.add(new Empdep(233,"anay","finance"));
		empd.add(new Empdep(491,"divya","dev"));
	}
	public static void main(String[] args) {
		ArrayList<Empdep> empd=new ArrayList<>();
		EmpdepMain emp=new EmpdepMain();
		emp.setArrayList(empd);
		System.out.println(empd);
		Collections.sort(empd,new ArrayListNameSort());
		System.out.println( "sorted:"+empd);

	}

}
