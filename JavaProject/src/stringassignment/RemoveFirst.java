package stringassignment;

public class RemoveFirst {
	void remove(String s)
	{
		s=s.substring(1);
		System.out.println(s);
	}

	public static void main(String[] args) {
		String s="java";
		RemoveFirst r=new RemoveFirst();
		r.remove(s);

	}

}
