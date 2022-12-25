package stringassignment;

public class RemoveFirstAndLastOccurance {
	void removeFirstandLastChar(String s)
	{
		s=s.substring(1, s.length()-1);
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		RemoveFirstAndLastOccurance r=new RemoveFirstAndLastOccurance();
		r.removeFirstandLastChar(s);

	}

}
